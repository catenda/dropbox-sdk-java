/* DO NOT EDIT */
/* This file was generated from team_members.stone */

package com.dropbox.core.v2.team;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.StructSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.util.List;

class MembersGetInfoArgs {
    // struct MembersGetInfoArgs

    protected final List<UserSelectorArg> members;

    /**
     *
     * @param members  List of team members. Must not contain a {@code null}
     *     item and not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersGetInfoArgs(List<UserSelectorArg> members) {
        if (members == null) {
            throw new IllegalArgumentException("Required value for 'members' is null");
        }
        for (UserSelectorArg x : members) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'members' is null");
            }
        }
        this.members = members;
    }

    /**
     * List of team members.
     *
     * @return value for this field, never {@code null}.
     */
    public List<UserSelectorArg> getMembers() {
        return members;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            members
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
            MembersGetInfoArgs other = (MembersGetInfoArgs) obj;
            return (this.members == other.members) || (this.members.equals(other.members));
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
    static final class Serializer extends StructSerializer<MembersGetInfoArgs> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MembersGetInfoArgs value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("members");
            StoneSerializers.list(UserSelectorArg.Serializer.INSTANCE).serialize(value.members, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public MembersGetInfoArgs deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            MembersGetInfoArgs value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<UserSelectorArg> f_members = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("members".equals(field)) {
                        f_members = StoneSerializers.list(UserSelectorArg.Serializer.INSTANCE).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_members == null) {
                    throw new JsonParseException("Required field \"members\" missing.", p.getCurrentLocation());
                }
                value = new MembersGetInfoArgs(f_members);
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
