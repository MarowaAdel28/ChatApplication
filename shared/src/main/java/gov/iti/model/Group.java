package gov.iti.model;

import java.io.Serializable;

public class Group implements Serializable{
    private int groupId;
    private String groupName ;
    public Group(String groupName){
        this.groupName=groupName;
    }
    public int getGroupId() {
        return groupId;
    }
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    
}
