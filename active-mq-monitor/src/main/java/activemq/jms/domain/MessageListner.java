/*
 * MessageListner.java
 * 
 */


package activemq.jms.domain;

/**
 * @author kabraa
 */
public class MessageListner {

    private Integer listenerId;

    private String listenerName;

    private String listenerAppName;

    private Integer correspondingTopicId;

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((correspondingTopicId == null) ? 0 : correspondingTopicId.hashCode());
        result = prime * result + ((listenerAppName == null) ? 0 : listenerAppName.hashCode());
        result = prime * result + ((listenerId == null) ? 0 : listenerId.hashCode());
        result = prime * result + ((listenerName == null) ? 0 : listenerName.hashCode());
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
        MessageListner other = (MessageListner) obj;
        if (correspondingTopicId == null) {
            if (other.correspondingTopicId != null)
                return false;
        } else if (!correspondingTopicId.equals(other.correspondingTopicId))
            return false;
        if (listenerAppName == null) {
            if (other.listenerAppName != null)
                return false;
        } else if (!listenerAppName.equals(other.listenerAppName))
            return false;
        if (listenerId == null) {
            if (other.listenerId != null)
                return false;
        } else if (!listenerId.equals(other.listenerId))
            return false;
        if (listenerName == null) {
            if (other.listenerName != null)
                return false;
        } else if (!listenerName.equals(other.listenerName))
            return false;
        return true;
    }

    public Integer getListenerId() {
        return listenerId;
    }

    public void setListenerId(Integer listenerId) {
        this.listenerId = listenerId;
    }

    public String getListenerName() {
        return listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    public String getListenerAppName() {
        return listenerAppName;
    }

    public void setListenerAppName(String listenerAppName) {
        this.listenerAppName = listenerAppName;
    }

    public Integer getCorrespondingTopicId() {
        return correspondingTopicId;
    }

    public void setCorrespondingTopicId(Integer correspondingTopicId) {
        this.correspondingTopicId = correspondingTopicId;
    }

}
