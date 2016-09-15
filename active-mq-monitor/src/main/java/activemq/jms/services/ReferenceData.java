
package activemq.jms.services;

import java.util.List;
import java.util.Map;

import javax.jms.Message;

import activemq.jms.domain.MessageBody;
import activemq.jms.domain.MessageListner;
import activemq.jms.domain.Topic;

public interface ReferenceData {

    public Message getMessageById(Integer id);

    public List<MessageBody> getActiveMessagesByTopicId(Integer id);

    public List<MessageBody> getPendingMessageByAppName(String appName);

    public List<Topic> getAllTopics();

    public List<MessageListner> getAllMessageListeners();

    public MessageBody getMessageBodyById(Integer messageId);

    public List<MessageListner> getListenersForTopic(Integer topicId);

    public Map<Integer, MessageListner> getTopicAndListenersMap();

}
