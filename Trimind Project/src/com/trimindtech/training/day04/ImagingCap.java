package com.trimindtech.training.day04;

public class ImagingCap {
    public String groupName;
    public String projectTitle;
    public int noOfMembers;
    public double feePerMember;
    ImagingCap()
    {
        this.feePerMember=200.00;
        this.groupName="UCEKU";
        this.projectTitle="TrimindTechSolutions";
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getNoOfMembers() {
        return noOfMembers;
    }

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    public double getFeePerMember() {
        return feePerMember;
    }

    public void setFeePerMember(double feePerMember) {
        this.feePerMember = feePerMember;
    }
    public double calcCollectionPerGroup()
    {
     double Collectionpergroup=feePerMember*noOfMembers;
     return Collectionpergroup;
    }

    @Override
    public String toString() {
        return "ImagingCap{" +
                "groupName='" + groupName + '\'' +
                ", projectTitle='" + projectTitle + '\'' +
                ", noOfMembers=" + noOfMembers +
                ", feePerMember=" + feePerMember +
                '}';
    }
}
