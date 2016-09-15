/*
 * MessageBody.java
 * 
 */

/*
 * Copyright (c) 2016 D. E. Shaw & Co., L.P. All rights reserved.
 *  
 * This software is the confidential and proprietary information
 * of D. E. Shaw & Co., L.P. ("Confidential Information").  You
 * shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement
 * you entered into with D. E. Shaw & Co., L.P.
 */

package activemq.jms.domain;

import java.util.List;

/**
 * @author kabraa
 */
public class MessageBody {

    private Integer messageId;

    private List<RecordPair> recordList;

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((messageId == null) ? 0 : messageId.hashCode());
        result = prime * result + ((recordList == null) ? 0 : recordList.hashCode());
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
        MessageBody other = (MessageBody) obj;
        if (messageId == null) {
            if (other.messageId != null)
                return false;
        } else if (!messageId.equals(other.messageId))
            return false;
        if (recordList == null) {
            if (other.recordList != null)
                return false;
        } else if (!recordList.equals(other.recordList))
            return false;
        return true;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public List<RecordPair> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<RecordPair> recordList) {
        this.recordList = recordList;
    }

}
