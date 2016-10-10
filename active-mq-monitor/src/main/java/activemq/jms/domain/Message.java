/*
 * Message.java
 * 
 */

package activemq.jms.domain;

import java.util.Date;

/**
 * @author kabraa
 */
public class Message {

    private Integer messageId;

    private String publisherAppName;

    private Date publishDate;

    private Boolean isExpired;

    private Integer remainingListeners;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getPublisherAppName() {
        return publisherAppName;
    }

    public void setPublisherAppName(String publisherAppName) {
        this.publisherAppName = publisherAppName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
    }

    public Integer getRemainingListeners() {
        return remainingListeners;
    }

    public void setRemainingListeners(Integer remainingListeners) {
        this.remainingListeners = remainingListeners;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isExpired == null) ? 0 : isExpired.hashCode());
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
        result = prime * result + ((publisherAppName == null) ? 0 : publisherAppName.hashCode());
        result = prime * result + ((remainingListeners == null) ? 0 : remainingListeners.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Message other = (Message) obj;
        if (isExpired == null) {
            if (other.isExpired != null)
                return false;
        } else if (!isExpired.equals(other.isExpired))
            return false;
        if (messageId == null) {
            if (other.messageId != null)
                return false;
        } else if (!messageId.equals(other.messageId))
            return false;
        if (publishDate == null) {
            if (other.publishDate != null)
                return false;
        } else if (!publishDate.equals(other.publishDate))
            return false;
        if (publisherAppName == null) {
            if (other.publisherAppName != null)
                return false;
        } else if (!publisherAppName.equals(other.publisherAppName))
            return false;
        if (remainingListeners == null) {
            if (other.remainingListeners != null)
                return false;
        } else if (!remainingListeners.equals(other.remainingListeners))
            return false;
        return true;
    }

}
