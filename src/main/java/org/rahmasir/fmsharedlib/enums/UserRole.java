package org.rahmasir.fmsharedlib.enums;

/**
 * Represents the distinct roles a user can have within the system.
 * This enum is used for authorization purposes to control access to different operations.
 */
public enum UserRole {
    /**
     * A user who can create projects and hire freelancers.
     */
    EMPLOYER,

    /**
     * A user who can apply for projects and perform work.
     */
    FREELANCER
}
