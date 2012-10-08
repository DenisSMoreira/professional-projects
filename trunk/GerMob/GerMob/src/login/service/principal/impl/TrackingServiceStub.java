/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.service.principal.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import login.model.Issue.IssueStatus;
import login.model.ObservableIssue;
import login.service.principal.TrackingService;

public class TrackingServiceStub implements TrackingService {

    // You add a project by adding an entry with an empty observable array list
    // of issue IDs in the projects Map.
    final ObservableMap<String, ObservableList<String>> projectsMap;
    {
        final Map<String, ObservableList<String>> map = new TreeMap<String, ObservableList<String>>();
        projectsMap = FXCollections.observableMap(map);
        for (String s : newList("Quets", "Ping Ming", "Bunisses", "Sokkyo")) {
            projectsMap.put(s, FXCollections.<String>observableArrayList());
        }
    }

    // The projectNames list is kept in sync with the project's map by observing
    // the projectsMap and modifying the projectNames list in consequence.
    final MapChangeListener<String, ObservableList<String>> projectsMapChangeListener = new MapChangeListener<String, ObservableList<String>>() {
        @Override
        public void onChanged(Change<? extends String, ? extends ObservableList<String>> change) {
            if (change.wasAdded()) projectNames.add(change.getKey());
            if (change.wasRemoved()) projectNames.remove(change.getKey());
        }
    };
    final ObservableList<String> projectNames;
    {
        projectNames = FXCollections.<String>observableArrayList();
        projectNames.addAll(projectsMap.keySet());
        projectsMap.addListener(projectsMapChangeListener);
    }

    // A Issue stub.
    public final class IssueStub implements ObservableIssue {
        private final SimpleStringProperty id;
        private final SimpleStringProperty projectName;
        private final SimpleStringProperty title;
        private final SimpleStringProperty description;
        private final SimpleObjectProperty<IssueStatus> status =
                new SimpleObjectProperty<IssueStatus>(IssueStatus.NEW);

        IssueStub(String projectName, String id) {
            this(projectName, id, null);
        }
        IssueStub(String projectName, String id, String title) {
            assert projectNames.contains(projectName);
            assert ! projectsMap.get(projectName).contains(id);
            assert ! issuesMap.containsKey(id);
            this.projectName = new SimpleStringProperty(projectName);
            this.id = new SimpleStringProperty(id);
            this.title = new SimpleStringProperty(title);
            this.description = new SimpleStringProperty("");
        }

        @Override
        public IssueStatus getStatus() {
            return status.get();
        }

        @Override
        public String getId() {
            return id.get();
        }

        @Override
        public String getProjectName() {
            return projectName.get();
        }

        @Override
        public String getSynopsis() {
            return title.get();
        }

        private void setSynopsis(String title) {
            this.title.set(title);
        }

        @Override
        public String getDescription() {
            return description.get();
        }

        private void setDescription(String description) {
            this.description.set(description);
        }

        private void setStatus(IssueStatus issueStatus) {
            this.status.set(issueStatus);
        }

        @Override
        public ObservableValue<String> idProperty() {
            return id;
        }

        @Override
        public ObservableValue<String> projectNameProperty() {
            return projectName;
        }

        @Override
        public ObservableValue<IssueStatus> statusProperty() {
            return status;
        }

        @Override
        public ObservableValue<String> synopsisProperty() {
            return title;
        }

        @Override
        public ObservableValue<String> descriptionProperty() {
            return description;
        }
    }

    // You create new issue by adding a IssueStub instance to the issuesMap.
    // the new id will be automatically added to the corresponding list in
    // the projectsMap.
    //
    final MapChangeListener<String, IssueStub> issuesMapChangeListener = new MapChangeListener<String, IssueStub>() {
        @Override
        public void onChanged(Change<? extends String, ? extends IssueStub> change) {
            if (change.wasAdded()) {
                final IssueStub val = change.getValueAdded();
                projectsMap.get(val.getProjectName()).add(val.getId());
            }
            if (change.wasRemoved()) {
                final IssueStub val = change.getValueRemoved();
                projectsMap.get(val.getProjectName()).remove(val.getId());
            }
        }
    };
    
    final AtomicInteger issueCounter = new AtomicInteger(0);
    final ObservableMap<String, IssueStub> issuesMap;
    {
        final Map<String, IssueStub> map = new TreeMap<String, IssueStub>();
        issuesMap = FXCollections.observableMap(map);
        issuesMap.addListener(issuesMapChangeListener);
        IssueStub ts;
        ts = createIssueFor("Quets");
        ts.setSynopsis("Desenvoler Layout - Quets");
        ts.setDescription("Para: \"Guilherme\"");
        ts = createIssueFor("Quets");
        ts.setSynopsis("Desenvoler Analise - Quets");
        ts.setDescription("Para: \"Denis Soares Moreira\"");
        ts = createIssueFor("Ping Ming");
        ts.setSynopsis("Desenvoler Layout");
        ts.setDescription("Para: \"The Wanderings Of Oisin\".\nW. B. Yeats.");
        ts = createIssueFor("Sokkyo");
        ts.setSynopsis("TDesenvoler Layout");
        ts.setDescription("Para: \"The Wanderings Of Oisin\".\nW. B. Yeats.");
        ts = createIssueFor("Bunisses");
        ts.setSynopsis("Desenvoler Layout");
        ts.setDescription("Para: \"The Wanderings Of Oisin\".\nW. B. Yeats.");
        ts = createIssueFor("Ping Ming");
        ts.setSynopsis("Desenvoler Padrões");
        ts.setDescription("Para: \"The Wanderings Of Oisin\".\nW. B. Yeats.");
        ts = createIssueFor("Quets");
        ts.setSynopsis("Desenvoler Prototipo");
        ts.setDescription("Para: \"The Wanderings Of Oisin\".\nW. B. Yeats.");
        ts = createIssueFor("Sokkyo");
        ts.setSynopsis("Desenvoler UML");
        ts.setDescription("Para: \"William Butler Yeats\".");
    }

    private static <T> List<T> newList(T... items) {
        return Arrays.asList(items);
    }


    @Override
    public IssueStub createIssueFor(String projectName) {
        assert projectNames.contains(projectName);
        final IssueStub issue = new IssueStub(projectName, "TT-"+issueCounter.incrementAndGet());
        assert issuesMap.containsKey(issue.getId()) == false;
        assert projectsMap.get(projectName).contains(issue.getId()) == false;
        issuesMap.put(issue.getId(), issue);
        return issue;
    }

    @Override
    public void deleteIssue(String issueId) {
        assert issuesMap.containsKey(issueId);
        issuesMap.remove(issueId);
    }

    @Override
    public ObservableList<String> getProjectNames() {
        return projectNames;
    }

    @Override
    public ObservableList<String> getIssueIds(String projectName) {
        return projectsMap.get(projectName);
    }

    @Override
    public IssueStub getIssue(String issueId) {
        return issuesMap.get(issueId);
    }

    @Override
    public void saveIssue(String issueId, IssueStatus status,
            String synopsis, String description) {
        IssueStub issue = getIssue(issueId);
        issue.setDescription(description);
        issue.setSynopsis(synopsis);
        issue.setStatus(status);
    }

}
