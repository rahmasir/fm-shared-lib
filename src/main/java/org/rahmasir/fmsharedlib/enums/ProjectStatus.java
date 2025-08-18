package org.rahmasir.fmsharedlib.enums;

/**
 * Represents the lifecycle status of a Project.
 */
public enum ProjectStatus {
    /**
     * The project is open and freelancers can apply to it.
     */
    ACTIVE,

    /**
     * The project is closed, typically because a freelancer has been hired.
     * No more applications can be submitted.
     */
    INACTIVE
}
