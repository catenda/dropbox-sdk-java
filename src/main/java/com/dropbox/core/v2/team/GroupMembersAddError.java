/* DO NOT EDIT */
/* This file was generated from team_groups.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.List;

/**
 * This class is a tagged union.  Tagged unions instances are always associated
 * to a specific tag.  This means only one of the {@code isAbc()} methods will
 * return {@code true}. You can use {@link #tag()} to determine the tag
 * associated with this instance.
 */
public final class GroupMembersAddError {
    // union GroupMembersAddError

    /**
     * Discriminating tag type for {@link GroupMembersAddError}.
     */
    public enum Tag {
        /**
         * No matching group found. No groups match the specified group ID.
         */
        GROUP_NOT_FOUND,
        OTHER,
        /**
         * You cannot add duplicate users. One or more of the members you are
         * trying to add is already a member of the group.
         */
        DUPLICATE_USER,
        /**
         * Group is not in this team. You cannot add members to a group that is
         * outside of your team.
         */
        GROUP_NOT_IN_TEAM,
        /**
         * These members are not part of your team. Currently, you cannot add
         * members to a group if they are not part of your team, though this may
         * change in a subsequent version. To add new members to your Dropbox
         * Business team, use the {@link DbxTeamTeamRequests#membersAdd(List)}
         * endpoint.
         */
        MEMBERS_NOT_IN_TEAM, // List<String>
        /**
         * These users were not found in Dropbox.
         */
        USERS_NOT_FOUND, // List<String>
        /**
         * A suspended user cannot be added to a group as {@link
         * GroupAccessType#OWNER}.
         */
        USER_MUST_BE_ACTIVE_TO_BE_OWNER,
        /**
         * A company-managed group cannot be managed by a user.
         */
        USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP; // List<String>
    }

    /**
     * No matching group found. No groups match the specified group ID.
     */
    public static final GroupMembersAddError GROUP_NOT_FOUND = new GroupMembersAddError(Tag.GROUP_NOT_FOUND, null, null, null);
    public static final GroupMembersAddError OTHER = new GroupMembersAddError(Tag.OTHER, null, null, null);
    /**
     * You cannot add duplicate users. One or more of the members you are trying
     * to add is already a member of the group.
     */
    public static final GroupMembersAddError DUPLICATE_USER = new GroupMembersAddError(Tag.DUPLICATE_USER, null, null, null);
    /**
     * Group is not in this team. You cannot add members to a group that is
     * outside of your team.
     */
    public static final GroupMembersAddError GROUP_NOT_IN_TEAM = new GroupMembersAddError(Tag.GROUP_NOT_IN_TEAM, null, null, null);
    /**
     * A suspended user cannot be added to a group as {@link
     * GroupAccessType#OWNER}.
     */
    public static final GroupMembersAddError USER_MUST_BE_ACTIVE_TO_BE_OWNER = new GroupMembersAddError(Tag.USER_MUST_BE_ACTIVE_TO_BE_OWNER, null, null, null);

    private final Tag tag;
    private final List<String> membersNotInTeamValue;
    private final List<String> usersNotFoundValue;
    private final List<String> userCannotBeManagerOfCompanyManagedGroupValue;

    /**
     *
     * @param tag  Discriminating tag for this instance.
     */
    private GroupMembersAddError(Tag tag, List<String> membersNotInTeamValue, List<String> usersNotFoundValue, List<String> userCannotBeManagerOfCompanyManagedGroupValue) {
        this.tag = tag;
        this.membersNotInTeamValue = membersNotInTeamValue;
        this.usersNotFoundValue = usersNotFoundValue;
        this.userCannotBeManagerOfCompanyManagedGroupValue = userCannotBeManagerOfCompanyManagedGroupValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code GroupMembersAddError}. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#GROUP_NOT_FOUND}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#GROUP_NOT_FOUND}, {@code false} otherwise.
     */
    public boolean isGroupNotFound() {
        return this.tag == Tag.GROUP_NOT_FOUND;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this.tag == Tag.OTHER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#DUPLICATE_USER}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#DUPLICATE_USER}, {@code false} otherwise.
     */
    public boolean isDuplicateUser() {
        return this.tag == Tag.DUPLICATE_USER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#GROUP_NOT_IN_TEAM}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#GROUP_NOT_IN_TEAM}, {@code false} otherwise.
     */
    public boolean isGroupNotInTeam() {
        return this.tag == Tag.GROUP_NOT_IN_TEAM;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#MEMBERS_NOT_IN_TEAM}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#MEMBERS_NOT_IN_TEAM}, {@code false} otherwise.
     */
    public boolean isMembersNotInTeam() {
        return this.tag == Tag.MEMBERS_NOT_IN_TEAM;
    }

    /**
     * Returns an instance of {@code GroupMembersAddError} that has its tag set
     * to {@link Tag#MEMBERS_NOT_IN_TEAM}.
     *
     * <p> These members are not part of your team. Currently, you cannot add
     * members to a group if they are not part of your team, though this may
     * change in a subsequent version. To add new members to your Dropbox
     * Business team, use the {@link DbxTeamTeamRequests#membersAdd(List)}
     * endpoint. </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code GroupMembersAddError} with its tag set to
     *     {@link Tag#MEMBERS_NOT_IN_TEAM}.
     *
     * @throws IllegalArgumentException  if {@code value} contains a {@code
     *     null} item or is {@code null}.
     */
    public static GroupMembersAddError membersNotInTeam(List<String> value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        for (String x : value) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list is null");
            }
        }
        return new GroupMembersAddError(Tag.MEMBERS_NOT_IN_TEAM, value, null, null);
    }

    /**
     * These members are not part of your team. Currently, you cannot add
     * members to a group if they are not part of your team, though this may
     * change in a subsequent version. To add new members to your Dropbox
     * Business team, use the {@link DbxTeamTeamRequests#membersAdd(List)}
     * endpoint.
     *
     * <p> This instance must be tagged as {@link Tag#MEMBERS_NOT_IN_TEAM}. </p>
     *
     * @return The {@link GroupMembersAddError#membersNotInTeam} value
     *     associated with this instance if {@link #isMembersNotInTeam} is
     *     {@code true}.
     *
     * @throws IllegalStateException  If {@link #isMembersNotInTeam} is {@code
     *     false}.
     */
    public List<String> getMembersNotInTeamValue() {
        if (this.tag != Tag.MEMBERS_NOT_IN_TEAM) {
            throw new IllegalStateException("Invalid tag: required Tag.MEMBERS_NOT_IN_TEAM, but was Tag." + tag.name());
        }
        return membersNotInTeamValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#USERS_NOT_FOUND}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#USERS_NOT_FOUND}, {@code false} otherwise.
     */
    public boolean isUsersNotFound() {
        return this.tag == Tag.USERS_NOT_FOUND;
    }

    /**
     * Returns an instance of {@code GroupMembersAddError} that has its tag set
     * to {@link Tag#USERS_NOT_FOUND}.
     *
     * <p> These users were not found in Dropbox. </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code GroupMembersAddError} with its tag set to
     *     {@link Tag#USERS_NOT_FOUND}.
     *
     * @throws IllegalArgumentException  if {@code value} contains a {@code
     *     null} item or is {@code null}.
     */
    public static GroupMembersAddError usersNotFound(List<String> value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        for (String x : value) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list is null");
            }
        }
        return new GroupMembersAddError(Tag.USERS_NOT_FOUND, null, value, null);
    }

    /**
     * These users were not found in Dropbox.
     *
     * <p> This instance must be tagged as {@link Tag#USERS_NOT_FOUND}. </p>
     *
     * @return The {@link GroupMembersAddError#usersNotFound} value associated
     *     with this instance if {@link #isUsersNotFound} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isUsersNotFound} is {@code
     *     false}.
     */
    public List<String> getUsersNotFoundValue() {
        if (this.tag != Tag.USERS_NOT_FOUND) {
            throw new IllegalStateException("Invalid tag: required Tag.USERS_NOT_FOUND, but was Tag." + tag.name());
        }
        return usersNotFoundValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#USER_MUST_BE_ACTIVE_TO_BE_OWNER}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#USER_MUST_BE_ACTIVE_TO_BE_OWNER}, {@code false} otherwise.
     */
    public boolean isUserMustBeActiveToBeOwner() {
        return this.tag == Tag.USER_MUST_BE_ACTIVE_TO_BE_OWNER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP}, {@code false}
     * otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP}, {@code false}
     *     otherwise.
     */
    public boolean isUserCannotBeManagerOfCompanyManagedGroup() {
        return this.tag == Tag.USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP;
    }

    /**
     * Returns an instance of {@code GroupMembersAddError} that has its tag set
     * to {@link Tag#USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP}.
     *
     * <p> A company-managed group cannot be managed by a user. </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code GroupMembersAddError} with its tag set to
     *     {@link Tag#USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP}.
     *
     * @throws IllegalArgumentException  if {@code value} contains a {@code
     *     null} item or is {@code null}.
     */
    public static GroupMembersAddError userCannotBeManagerOfCompanyManagedGroup(List<String> value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        for (String x : value) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list is null");
            }
        }
        return new GroupMembersAddError(Tag.USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP, null, null, value);
    }

    /**
     * A company-managed group cannot be managed by a user.
     *
     * <p> This instance must be tagged as {@link
     * Tag#USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP}. </p>
     *
     * @return The {@link
     *     GroupMembersAddError#userCannotBeManagerOfCompanyManagedGroup} value
     *     associated with this instance if {@link
     *     #isUserCannotBeManagerOfCompanyManagedGroup} is {@code true}.
     *
     * @throws IllegalStateException  If {@link
     *     #isUserCannotBeManagerOfCompanyManagedGroup} is {@code false}.
     */
    public List<String> getUserCannotBeManagerOfCompanyManagedGroupValue() {
        if (this.tag != Tag.USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP) {
            throw new IllegalStateException("Invalid tag: required Tag.USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP, but was Tag." + tag.name());
        }
        return userCannotBeManagerOfCompanyManagedGroupValue;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            tag,
            membersNotInTeamValue,
            usersNotFoundValue,
            userCannotBeManagerOfCompanyManagedGroupValue
        });
        hash = (31 * super.hashCode()) + hash;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof GroupMembersAddError) {
            GroupMembersAddError other = (GroupMembersAddError) obj;
            if (this.tag != other.tag) {
                return false;
            }
            switch (tag) {
                case GROUP_NOT_FOUND:
                    return true;
                case OTHER:
                    return true;
                case DUPLICATE_USER:
                    return true;
                case GROUP_NOT_IN_TEAM:
                    return true;
                case MEMBERS_NOT_IN_TEAM:
                    return (this.membersNotInTeamValue == other.membersNotInTeamValue) || (this.membersNotInTeamValue.equals(other.membersNotInTeamValue));
                case USERS_NOT_FOUND:
                    return (this.usersNotFoundValue == other.usersNotFoundValue) || (this.usersNotFoundValue.equals(other.usersNotFoundValue));
                case USER_MUST_BE_ACTIVE_TO_BE_OWNER:
                    return true;
                case USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP:
                    return (this.userCannotBeManagerOfCompanyManagedGroupValue == other.userCannotBeManagerOfCompanyManagedGroupValue) || (this.userCannotBeManagerOfCompanyManagedGroupValue.equals(other.userCannotBeManagerOfCompanyManagedGroupValue));
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<GroupMembersAddError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GroupMembersAddError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case GROUP_NOT_FOUND: {
                    g.writeString("group_not_found");
                    break;
                }
                case OTHER: {
                    g.writeString("other");
                    break;
                }
                case DUPLICATE_USER: {
                    g.writeString("duplicate_user");
                    break;
                }
                case GROUP_NOT_IN_TEAM: {
                    g.writeString("group_not_in_team");
                    break;
                }
                case MEMBERS_NOT_IN_TEAM: {
                    g.writeStartObject();
                    writeTag("members_not_in_team", g);
                    g.writeFieldName("members_not_in_team");
                    StoneSerializers.list(StoneSerializers.string()).serialize(value.membersNotInTeamValue, g);
                    g.writeEndObject();
                    break;
                }
                case USERS_NOT_FOUND: {
                    g.writeStartObject();
                    writeTag("users_not_found", g);
                    g.writeFieldName("users_not_found");
                    StoneSerializers.list(StoneSerializers.string()).serialize(value.usersNotFoundValue, g);
                    g.writeEndObject();
                    break;
                }
                case USER_MUST_BE_ACTIVE_TO_BE_OWNER: {
                    g.writeString("user_must_be_active_to_be_owner");
                    break;
                }
                case USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP: {
                    g.writeStartObject();
                    writeTag("user_cannot_be_manager_of_company_managed_group", g);
                    g.writeFieldName("user_cannot_be_manager_of_company_managed_group");
                    StoneSerializers.list(StoneSerializers.string()).serialize(value.userCannotBeManagerOfCompanyManagedGroupValue, g);
                    g.writeEndObject();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value.tag());
                }
            }
        }

        @Override
        public GroupMembersAddError deserialize(JsonParser p) throws IOException, JsonParseException {
            GroupMembersAddError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException("Required field missing: " + TAG_FIELD, p.getCurrentLocation());
            }
            else if ("group_not_found".equals(tag)) {
                value = GroupMembersAddError.GROUP_NOT_FOUND;
            }
            else if ("other".equals(tag)) {
                value = GroupMembersAddError.OTHER;
            }
            else if ("duplicate_user".equals(tag)) {
                value = GroupMembersAddError.DUPLICATE_USER;
            }
            else if ("group_not_in_team".equals(tag)) {
                value = GroupMembersAddError.GROUP_NOT_IN_TEAM;
            }
            else if ("members_not_in_team".equals(tag)) {
                List<String> fieldValue = null;
                expectField("members_not_in_team", p);
                fieldValue = StoneSerializers.list(StoneSerializers.string()).deserialize(p);
                value = GroupMembersAddError.membersNotInTeam(fieldValue);
            }
            else if ("users_not_found".equals(tag)) {
                List<String> fieldValue = null;
                expectField("users_not_found", p);
                fieldValue = StoneSerializers.list(StoneSerializers.string()).deserialize(p);
                value = GroupMembersAddError.usersNotFound(fieldValue);
            }
            else if ("user_must_be_active_to_be_owner".equals(tag)) {
                value = GroupMembersAddError.USER_MUST_BE_ACTIVE_TO_BE_OWNER;
            }
            else if ("user_cannot_be_manager_of_company_managed_group".equals(tag)) {
                List<String> fieldValue = null;
                expectField("user_cannot_be_manager_of_company_managed_group", p);
                fieldValue = StoneSerializers.list(StoneSerializers.string()).deserialize(p);
                value = GroupMembersAddError.userCannotBeManagerOfCompanyManagedGroup(fieldValue);
            }
            else {
                throw new JsonParseException("Unknown tag: " + tag, p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
