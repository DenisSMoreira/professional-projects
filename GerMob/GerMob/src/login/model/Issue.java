/*
 * Copyright (c) 2012, Oracle and/or its affiliates. All rights reserved.
 */
package login.model;

public interface Issue {

    public static enum IssueStatus {
        NEW, OPENED, FIXED, CLOSED
    }
    public static enum IssuePriority {
        LOW, MEDIUM, HIGH
    }

    public long getDate();
    public String getId();
    public String getProjectName();
    public IssueStatus getStatus();
    public IssuePriority getPriority();
    public String getSynopsis();
    public String getDescription();
}
