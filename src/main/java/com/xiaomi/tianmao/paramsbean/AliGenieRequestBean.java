package com.xiaomi.tianmao.paramsbean;

import java.util.List;

/**
 * Description: <br>
 * User: dell - XiaomiLi<br>
 * Date: 2018-08-27<br>
 * Time: 8:47<br>
 * UpdateDescription：<br>
 */
public class AliGenieRequestBean {

    /**
     * sessionId : 955c6796-58ed-4254-9513-c54f7ca23628
     * utterance : 你好小米谷歌的密码是多少
     * skillId : 20426
     * skillName : 米生活
     * intentId : 23690
     * intentName : 账号信息
     * requestData : {"city":"石家庄市"}
     * slotEntities : [{"intentParameterId":24076,"intentParameterName":"account","originalValue":"谷歌","standardValue":"谷歌","liveTime":0,"createTimeStamp":1535120712062,"slotValue":"谷歌"}]
     * botId : 10
     * domainId : 20029
     * requestId : 20180824222512035-1729115729
     * skillNluInfo : {"isNluLink":true,"invocationName":"你好小米","isTest":true}
     */

    /**
     * 会话ID，session内的对话此ID相同 必传
     */
    private String sessionId;
    /**
     * 用户输入语句 必传
     */
    private String utterance;
    /**
     * 技能ID 必传
     */
    private Long skillId;
    /**
     * 技能名称  必传
     */
    private String skillName;
    /**
     * 意图ID 必传
     */
    private Long intentId;
    /**
     * 意图名称 必传
     */
    private String intentName;
    /**
     * 业务请求附带参数,来自于设备调用语义理解服务额外携带的信息，只做透传
     * 不必传
     */
    private RequestDataBean requestData;
    /**
     * 应用ID，来自于创建的应用或者技能 必传
     */
    private Long botId;
    /**
     * 领域ID 必传
     */
    private Long domainId;
    /**
     * 请求ID？
     */
    private String requestId;
    private SkillNluInfoBean skillNluInfo;
    private List<SlotEntitiesBean> slotEntities;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Long getIntentId() {
        return intentId;
    }

    public void setIntentId(Long intentId) {
        this.intentId = intentId;
    }

    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    public RequestDataBean getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestDataBean requestData) {
        this.requestData = requestData;
    }

    public Long getBotId() {
        return botId;
    }

    public void setBotId(Long botId) {
        this.botId = botId;
    }

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SkillNluInfoBean getSkillNluInfo() {
        return skillNluInfo;
    }

    public void setSkillNluInfo(SkillNluInfoBean skillNluInfo) {
        this.skillNluInfo = skillNluInfo;
    }

    public List<SlotEntitiesBean> getSlotEntities() {
        return slotEntities;
    }

    public void setSlotEntities(List<SlotEntitiesBean> slotEntities) {
        this.slotEntities = slotEntities;
    }

    public static class RequestDataBean {
        /**
         * city : 石家庄市
         * 放置设备所处的城市信息
         */

        private String city;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static class SkillNluInfoBean {
        /**
         * isNluLink : true
         * invocationName : 你好小米
         * isTest : true
         */

        private boolean isNluLink;
        private String invocationName;
        private boolean isTest;

        public boolean isIsNluLink() {
            return isNluLink;
        }

        public void setIsNluLink(boolean isNluLink) {
            this.isNluLink = isNluLink;
        }

        public String getInvocationName() {
            return invocationName;
        }

        public void setInvocationName(String invocationName) {
            this.invocationName = invocationName;
        }

        public boolean isIsTest() {
            return isTest;
        }

        public void setIsTest(boolean isTest) {
            this.isTest = isTest;
        }
    }

    public static class SlotEntitiesBean {
        /**
         * intentParameterId : 24076
         * intentParameterName : account
         * originalValue : 谷歌
         * standardValue : 谷歌
         * liveTime : 0
         * createTimeStamp : 1535120712062
         * slotValue : 谷歌
         */

        /**
         * 意图参数ID 必传
         */
        private long intentParameterId;
        /**
         * 意图参数名 必传
         */
        private String intentParameterName;
        /**
         * 原始句子中抽取出来的未做处理的slot值 必传
         */
        private String originalValue;
        /**
         * 原始slot归一化后的值 必传
         */
        private String standardValue;
        /**
         *该slot已生存时间（会话轮数） 必传
         */
        private int liveTime;
        /**
         *该slot产生的时间点 必传
         */
        private long createTimeStamp;
        /**
         *
         */
        private String slotValue;

        public long getIntentParameterId() {
            return intentParameterId;
        }

        public void setIntentParameterId(long intentParameterId) {
            this.intentParameterId = intentParameterId;
        }

        public String getIntentParameterName() {
            return intentParameterName;
        }

        public void setIntentParameterName(String intentParameterName) {
            this.intentParameterName = intentParameterName;
        }

        public String getOriginalValue() {
            return originalValue;
        }

        public void setOriginalValue(String originalValue) {
            this.originalValue = originalValue;
        }

        public String getStandardValue() {
            return standardValue;
        }

        public void setStandardValue(String standardValue) {
            this.standardValue = standardValue;
        }

        public int getLiveTime() {
            return liveTime;
        }

        public void setLiveTime(int liveTime) {
            this.liveTime = liveTime;
        }

        public long getCreateTimeStamp() {
            return createTimeStamp;
        }

        public void setCreateTimeStamp(long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
        }

        public String getSlotValue() {
            return slotValue;
        }

        public void setSlotValue(String slotValue) {
            this.slotValue = slotValue;
        }
    }
}
