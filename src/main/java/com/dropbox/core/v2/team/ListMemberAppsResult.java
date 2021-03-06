/* DO NOT EDIT */
/* This file was generated from team_linked_apps.stone */

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

public class ListMemberAppsResult {
    // struct ListMemberAppsResult

    protected final List<ApiApp> linkedApiApps;

    /**
     *
     * @param linkedApiApps  List of third party applications linked by this
     *     team member. Must not contain a {@code null} item and not be {@code
     *     null}.
     *
     * @throws IllegalArgumentException  If any argument does not meet its
     *     preconditions.
     */
    public ListMemberAppsResult(List<ApiApp> linkedApiApps) {
        if (linkedApiApps == null) {
            throw new IllegalArgumentException("Required value for 'linkedApiApps' is null");
        }
        for (ApiApp x : linkedApiApps) {
            if (x == null) {
                throw new IllegalArgumentException("An item in list 'linkedApiApps' is null");
            }
        }
        this.linkedApiApps = linkedApiApps;
    }

    /**
     * List of third party applications linked by this team member
     *
     * @return value for this field, never {@code null}.
     */
    public List<ApiApp> getLinkedApiApps() {
        return linkedApiApps;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            linkedApiApps
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
            ListMemberAppsResult other = (ListMemberAppsResult) obj;
            return (this.linkedApiApps == other.linkedApiApps) || (this.linkedApiApps.equals(other.linkedApiApps));
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
    static final class Serializer extends StructSerializer<ListMemberAppsResult> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(ListMemberAppsResult value, JsonGenerator g, boolean collapse) throws IOException, JsonGenerationException {
            if (!collapse) {
                g.writeStartObject();
            }
            g.writeFieldName("linked_api_apps");
            StoneSerializers.list(ApiApp.Serializer.INSTANCE).serialize(value.linkedApiApps, g);
            if (!collapse) {
                g.writeEndObject();
            }
        }

        @Override
        public ListMemberAppsResult deserialize(JsonParser p, boolean collapsed) throws IOException, JsonParseException {
            ListMemberAppsResult value;
            String tag = null;
            if (!collapsed) {
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                List<ApiApp> f_linkedApiApps = null;
                while (p.getCurrentToken() == JsonToken.FIELD_NAME) {
                    String field = p.getCurrentName();
                    p.nextToken();
                    if ("linked_api_apps".equals(field)) {
                        f_linkedApiApps = StoneSerializers.list(ApiApp.Serializer.INSTANCE).deserialize(p);
                    }
                    else {
                        skipValue(p);
                    }
                }
                if (f_linkedApiApps == null) {
                    throw new JsonParseException("Required field \"linked_api_apps\" missing.", p.getCurrentLocation());
                }
                value = new ListMemberAppsResult(f_linkedApiApps);
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
