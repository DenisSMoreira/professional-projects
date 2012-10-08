/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.service.principal;

import javafx.collections.ObservableList;
import login.model.Issue.IssuePriority;
import login.model.Issue.IssueStatus;
import login.model.ObservableIssue;

public interface TrackingService {

    public ObservableList<String> getIssueIds(String projectName);
    public ObservableList<String> getProjectNames();
    public ObservableIssue getIssue(String tickectId);
    public ObservableIssue createIssueFor(String projectName);
    public void deleteIssue(String issueId);
    public void saveIssue(String issueId,
            IssueStatus status, IssuePriority priority,
            String synopsis, String description);
}
