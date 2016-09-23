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

public enum GroupMemberSetAccessTypeError {
    // union GroupMemberSetAccessTypeError
    /**
     * No matching group found. No groups match the specified group ID.
     */
    GROUP_NOT_FOUND,
    OTHER,
    /**
     * The specified user is not a member of this group.
     */
    MEMBER_NOT_IN_GROUP,
    /**
     * A company managed group cannot be managed by a user.
     */
    USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP;

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<GroupMemberSetAccessTypeError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(GroupMemberSetAccessTypeError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value) {
                case GROUP_NOT_FOUND: {
                    g.writeString("group_not_found");
                    break;
                }
                case OTHER: {
                    g.writeString("other");
                    break;
                }
                case MEMBER_NOT_IN_GROUP: {
                    g.writeString("member_not_in_group");
                    break;
                }
                case USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP: {
                    g.writeString("user_cannot_be_manager_of_company_managed_group");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value);
                }
            }
        }

        @Override
        public GroupMemberSetAccessTypeError deserialize(JsonParser p) throws IOException, JsonParseException {
            GroupMemberSetAccessTypeError value;
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
                value = GroupMemberSetAccessTypeError.GROUP_NOT_FOUND;
            }
            else if ("other".equals(tag)) {
                value = GroupMemberSetAccessTypeError.OTHER;
            }
            else if ("member_not_in_group".equals(tag)) {
                value = GroupMemberSetAccessTypeError.MEMBER_NOT_IN_GROUP;
            }
            else if ("user_cannot_be_manager_of_company_managed_group".equals(tag)) {
                value = GroupMemberSetAccessTypeError.USER_CANNOT_BE_MANAGER_OF_COMPANY_MANAGED_GROUP;
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
