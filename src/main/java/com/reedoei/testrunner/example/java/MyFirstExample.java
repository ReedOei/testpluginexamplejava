package com.reedoei.testrunner.example.java;

import com.reedoei.testrunner.mavenplugin.TestPlugin;
import org.apache.maven.project.MavenProject;

import java.util.Properties;

public class MyFirstExample extends TestPlugin {
    public void execute(final MavenProject project) {
        System.out.println(project.getArtifact().getGroupId());
    }
}
