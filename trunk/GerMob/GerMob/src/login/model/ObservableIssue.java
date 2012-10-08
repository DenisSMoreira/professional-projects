/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.model;

import javafx.beans.value.ObservableValue;

public interface ObservableIssue extends Issue {

    public ObservableValue<Number> dateProperty();
    public ObservableValue<String> idProperty();
    public ObservableValue<String> projectNameProperty();
    public ObservableValue<IssueStatus> statusProperty();
    public ObservableValue<IssuePriority> priorityProperty();
    public ObservableValue<String> synopsisProperty();
    public ObservableValue<String> descriptionProperty();
}
