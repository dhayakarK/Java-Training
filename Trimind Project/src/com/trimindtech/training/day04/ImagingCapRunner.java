package com.trimindtech.training.day04;

public class ImagingCapRunner {
    public static void main(String[] args) {
        ImagingCap i=new ImagingCap();
        /*i.groupName="Cyber";
        i.projectTitle="Technology";*/
        i.noOfMembers=5;
        i.calcCollectionPerGroup();
        System.out.println(i.toString());
        i.groupName="CyberCafe";
        i.projectTitle="TechCity";
        i.noOfMembers=10;
        i.feePerMember=2000.00;
        //System.out.println(i.getGroupName());
        System.out.println(i.toString());
    }
}
