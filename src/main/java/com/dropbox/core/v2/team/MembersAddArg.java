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

class MembersAddArg {
    // struct MembersAddArg

    protected final List<MemberAddArg> newMembers;
    protected final boolean forceAsync;

    /**
     *
     * @param newMembers  Details of new members to be added to the team. Must
     *     not contain a {@code null} item and not be {@code null}.
     * @param forceAsync  Whether to force the add to happen asynchronously.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersAddArg(List<MemberAddArg> newMembers, boolean forceAsync) {
        if (newMembers == null) {
            throw new IllegalArgumentException("Required value for 'newMembers' is null");
        }
        for (MemberAddArg x : newMembers) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'newMembers' is null");
            }
        }
        this.newMembers = newMembers;
        this.forceAsync = forceAsync;
    }

    /**
     * The default values for unset fields will be used.
     *
     * @param newMembers  Details of new members to be added to the team. Must
     *     not contain a {@code null} item and not be {@code null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public MembersAddArg(List<MemberAddArg> newMembers) {
        this(newMembers, false);
    }

    /**
     * Details of new members to be added to the team.
     *
     * @return value for this field, never {@code null}.
     */
    public List<MemberAddArg> getNewMembers() {
        return newMembers;
    }

    /**
     * Whether to force the add to happen asynchronously.
     *
     * @return value for this field, or {@code null} if not present. Defaults to
     *     false.
     */
    public boolean getForceAsync() {
        return forceAsync;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            newMembers,
            forceAsync
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
            MembersAddArg other = (MembersAddArg) obj;
            return ((this.newMembers == other.newMembers) || (this.newMembers.equals(other.newMembers)))
                && (this.forceAsync == other.forceAsync)
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
    static final class Serializer extends StructSerializer<MembersAddArg> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(MembersAddArg value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("new_members");
            StoneSerializers.list(MemberAddArg.Serializer.INSTANCE).serialize(value.newMembers, g);
            g.writeFieldName("force_async");
            StoneSerializers.boolean_().serialize(value.forceAsync, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public MembersAddArg deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            MembersAddArg value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<MemberAddArg> f_newMembers = null;
                Boolean f_forceAsync = false;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("new_members".equals(field)) {
                        f_newMembers = StoneSerializers.list(MemberAddArg.Serializer.INSTANCE).deserialize(p);
                    }
                    else if ("force_async".equals(field)) {
                        f_forceAsync = StoneSerializers.boolean_().deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_newMembers == null) {
                    throw new JsonParseException("Required field \"new_members\" missing.", p.getCurrentLocation());
                }
                value = new MembersAddArg(f_newMembers, f_forceAsync);
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
