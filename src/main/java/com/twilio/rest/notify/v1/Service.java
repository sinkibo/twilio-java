/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.notify.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Service extends Resource {
    private static final long serialVersionUID = 268486811093222L;

    /**
     * Create a ServiceCreator to execute create.
     * 
     * @return ServiceCreator capable of executing the create
     */
    public static ServiceCreator create() {
        return new ServiceCreator();
    }

    /**
     * Create a ServiceDeleter to execute delete.
     * 
     * @param sid The sid
     * @return ServiceDeleter capable of executing the delete
     */
    public static ServiceDeleter delete(final String sid) {
        return new ServiceDeleter(sid);
    }

    /**
     * Create a ServiceFetcher to execute fetch.
     * 
     * @param sid The sid
     * @return ServiceFetcher capable of executing the fetch
     */
    public static ServiceFetcher fetch(final String sid) {
        return new ServiceFetcher(sid);
    }

    /**
     * Create a ServiceReader to execute read.
     * 
     * @return ServiceReader capable of executing the read
     */
    public static ServiceReader read() {
        return new ServiceReader();
    }

    /**
     * Create a ServiceUpdater to execute update.
     * 
     * @param sid The sid
     * @return ServiceUpdater capable of executing the update
     */
    public static ServiceUpdater update(final String sid) {
        return new ServiceUpdater(sid);
    }

    /**
     * Converts a JSON String into a Service object using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Service object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String apnCredentialSid;
    private final String gcmCredentialSid;
    private final String messagingServiceSid;
    private final String facebookMessengerPageId;
    private final String defaultApnNotificationProtocolVersion;
    private final String defaultGcmNotificationProtocolVersion;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Service(@JsonProperty("sid")
                    final String sid, 
                    @JsonProperty("account_sid")
                    final String accountSid, 
                    @JsonProperty("friendly_name")
                    final String friendlyName, 
                    @JsonProperty("date_created")
                    final String dateCreated, 
                    @JsonProperty("date_updated")
                    final String dateUpdated, 
                    @JsonProperty("apn_credential_sid")
                    final String apnCredentialSid, 
                    @JsonProperty("gcm_credential_sid")
                    final String gcmCredentialSid, 
                    @JsonProperty("messaging_service_sid")
                    final String messagingServiceSid, 
                    @JsonProperty("facebook_messenger_page_id")
                    final String facebookMessengerPageId, 
                    @JsonProperty("default_apn_notification_protocol_version")
                    final String defaultApnNotificationProtocolVersion, 
                    @JsonProperty("default_gcm_notification_protocol_version")
                    final String defaultGcmNotificationProtocolVersion, 
                    @JsonProperty("url")
                    final URI url, 
                    @JsonProperty("links")
                    final Map<String, String> links) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.apnCredentialSid = apnCredentialSid;
        this.gcmCredentialSid = gcmCredentialSid;
        this.messagingServiceSid = messagingServiceSid;
        this.facebookMessengerPageId = facebookMessengerPageId;
        this.defaultApnNotificationProtocolVersion = defaultApnNotificationProtocolVersion;
        this.defaultGcmNotificationProtocolVersion = defaultGcmNotificationProtocolVersion;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The friendly_name.
     * 
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The apn_credential_sid.
     * 
     * @return The apn_credential_sid
     */
    public final String getApnCredentialSid() {
        return this.apnCredentialSid;
    }

    /**
     * Returns The The gcm_credential_sid.
     * 
     * @return The gcm_credential_sid
     */
    public final String getGcmCredentialSid() {
        return this.gcmCredentialSid;
    }

    /**
     * Returns The The messaging_service_sid.
     * 
     * @return The messaging_service_sid
     */
    public final String getMessagingServiceSid() {
        return this.messagingServiceSid;
    }

    /**
     * Returns The The facebook_messenger_page_id.
     * 
     * @return The facebook_messenger_page_id
     */
    public final String getFacebookMessengerPageId() {
        return this.facebookMessengerPageId;
    }

    /**
     * Returns The The default_apn_notification_protocol_version.
     * 
     * @return The default_apn_notification_protocol_version
     */
    public final String getDefaultApnNotificationProtocolVersion() {
        return this.defaultApnNotificationProtocolVersion;
    }

    /**
     * Returns The The default_gcm_notification_protocol_version.
     * 
     * @return The default_gcm_notification_protocol_version
     */
    public final String getDefaultGcmNotificationProtocolVersion() {
        return this.defaultGcmNotificationProtocolVersion;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        Service other = (Service) o;
        
        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(apnCredentialSid, other.apnCredentialSid) && 
               Objects.equals(gcmCredentialSid, other.gcmCredentialSid) && 
               Objects.equals(messagingServiceSid, other.messagingServiceSid) && 
               Objects.equals(facebookMessengerPageId, other.facebookMessengerPageId) && 
               Objects.equals(defaultApnNotificationProtocolVersion, other.defaultApnNotificationProtocolVersion) && 
               Objects.equals(defaultGcmNotificationProtocolVersion, other.defaultGcmNotificationProtocolVersion) && 
               Objects.equals(url, other.url) && 
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            dateCreated,
                            dateUpdated,
                            apnCredentialSid,
                            gcmCredentialSid,
                            messagingServiceSid,
                            facebookMessengerPageId,
                            defaultApnNotificationProtocolVersion,
                            defaultGcmNotificationProtocolVersion,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("friendlyName", friendlyName)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("apnCredentialSid", apnCredentialSid)
                          .add("gcmCredentialSid", gcmCredentialSid)
                          .add("messagingServiceSid", messagingServiceSid)
                          .add("facebookMessengerPageId", facebookMessengerPageId)
                          .add("defaultApnNotificationProtocolVersion", defaultApnNotificationProtocolVersion)
                          .add("defaultGcmNotificationProtocolVersion", defaultGcmNotificationProtocolVersion)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}