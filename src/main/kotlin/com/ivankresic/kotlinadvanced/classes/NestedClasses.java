package com.ivankresic.kotlinadvanced.classes;

/**
 * Created by ivan on 04/06/2020
 */
public class NestedClasses {
    public static void main(String[] args){
        //DirectoryExplorer.PermissionCheck permissionCheck = new DirectoryExplorer.PermissionCheck();


        //In order to enable this we have to annotate companion object in Kotlin with "@JvmStatic"
        Log log =  Log.createFileLog("");
    }
}
