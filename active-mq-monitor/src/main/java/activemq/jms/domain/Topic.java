/*
 * Topic.java
 * 
 */

package activemq.jms.domain;

/**
 * @author kabraa
 */
public class Topic {

    private Integer topicId;

    private String topicName;

    private String publisherAppName;

    private Integer registeredListeners;
    
    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((publisherAppName == null) ? 0 : publisherAppName.hashCode());
        result = prime * result + ((registeredListeners == null) ? 0 : registeredListeners.hashCode());
        result = prime * result + ((topicId == null) ? 0 : topicId.hashCode());
        result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
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
        Topic other = (Topic) obj;
        if (publisherAppName == null) {
            if (other.publisherAppName != null)
                return false;
        } else if (!publisherAppName.equals(other.publisherAppName))
            return false;
        if (registeredListeners == null) {
            if (other.registeredListeners != null)
                return false;
        } else if (!registeredListeners.equals(other.registeredListeners))
            return false;
        if (topicId == null) {
            if (other.topicId != null)
                return false;
        } else if (!topicId.equals(other.topicId))
            return false;
        if (topicName == null) {
            if (other.topicName != null)
                return false;
        } else if (!topicName.equals(other.topicName))
            return false;
        return true;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getPublisherAppName() {
        return publisherAppName;
    }

    public void setPublisherAppName(String publisherAppName) {
        this.publisherAppName = publisherAppName;
    }

    public Integer getRegisteredListeners() {
        return registeredListeners;
    }

    public void setRegisteredListeners(Integer registeredListeners) {
        this.registeredListeners = registeredListeners;
    }

}
