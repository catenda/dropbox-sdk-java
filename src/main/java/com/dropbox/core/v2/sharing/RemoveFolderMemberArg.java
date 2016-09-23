/* DO NOT EDIT */
/* This file was generated from sharing_folders.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

class RemoveFolderMemberArg {
    // struct RemoveFolderMemberArg

    protected final String sharedFolderId;
    protected final MemberSelector member;
    protected final boolean leaveACopy;

    /**
     *
     * @param sharedFolderId  The ID for the shared folder. Must match pattern
     *     "{@code [-_0-9a-zA-Z:]+}" and not be {@code null}.
     * @param member  The member to remove from the folder. Must not be {@code
     *     null}.
     * @param leaveACopy  If true, the removed user will keep their copy of the
     *     folder after it's unshared, assuming it was mounted. Otherwise, it
     *     will be removed from their Dropbox. Also, this must be set to false
     *     when kicking a group.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public RemoveFolderMemberArg(String sharedFolderId, MemberSelector member, boolean leaveACopy) {
        if (sharedFolderId == null) {
            throw new IllegalArgumentException("Required value for 'sharedFolderId' is null");
        }
        if (!java.util.regex.Pattern.matches("[-_0-9a-zA-Z:]+", sharedFolderId)) {
            throw new IllegalArgumentException("String 'sharedFolderId' does not match pattern");
        }
        this.sharedFolderId = sharedFolderId;
        if (member == null) {
            throw new IllegalArgumentException("Required value for 'member' is null");
        }
        this.member = member;
        this.leaveACopy = leaveACopy;
    }

    /**
     * The ID for the shared folder.
     *
     * @return value for this field, never {@code null}.
     */
    public String getSharedFolderId() {
        return sharedFolderId;
    }

    /**
     * The member to remove from the folder.
     *
     * @return value for this field, never {@code null}.
     */
    public MemberSelector getMember() {
        return member;
    }

    /**
     * If true, the removed user will keep their copy of the folder after it's
     * unshared, assuming it was mounted. Otherwise, it will be removed from
     * their Dropbox. Also, this must be set to false when kicking a group.
     *
     * @return value for this field.
     */
    public boolean getLeaveACopy() {
        return leaveACopy;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            sharedFolderId,
            member,
            leaveACopy
        });
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // be careful with inheritance
        else if (obj.getClass().equals(this.getClass())) {
            RemoveFolderMemberArg other = (RemoveFolderMemberArg) obj;
            return ((this.sharedFolderId == other.sharedFolderId) || (this.sharedFolderId.equals(other.sharedFolderId)))
                && ((this.member == other.member) || (this.member.equals(other.member)))
                && (this.leaveACopy == other.leaveACopy)
                ;
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
    static final class Serializer extends StructSerializer<RemoveFolderMemberArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(RemoveFolderMemberArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("shared_folder_id");
            StoneSerializers.string().serialize(value.sharedFolderId, g);
            g.writeFieldName("member");
            MemberSelector.Serializer.INSTANCE.serialize(value.member, g);
            g.writeFieldName("leave_a_copy");
            StoneSerializers.boolean_().serialize(value.leaveACopy, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public RemoveFolderMemberArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            RemoveFolderMemberArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                String f_sharedFolderId = null;
                MemberSelector f_member = null;
                Boolean f_leaveACopy = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("shared_folder_id".equals(field)) {
                        f_sharedFolderId = StoneSerializers.string().deserialize(p);
                    }
                    else if ("member".equals(field)) {
                        f_member = MemberSelector.Serializer.INSTANCE.deserialize(p);
                    }
                    else if ("leave_a_copy".equals(field)) {
                        f_leaveACopy = StoneSerializers.boolean_().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_sharedFolderId == null) {
                    throw new JsonParseException("Required field \"shared_folder_id\" missing.", p.getCurrentLocation());
                }
                if (f_member == null) {
                    throw new JsonParseException("Required field \"member\" missing.", p.getCurrentLocation());
                }
                if (f_leaveACopy == null) {
                    throw new JsonParseException("Required field \"leave_a_copy\" missing.", p.getCurrentLocation());
                }
                value = new RemoveFolderMemberArg(f_sharedFolderId, f_member, f_leaveACopy);
            }
            else {
                throw new JsonParseException("No subtype found that matches tag: \"" + tag + "\"", p.getCurrentLocation());
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}