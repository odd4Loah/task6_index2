package com.lihoo.jnshu.model;

import java.io.Serializable;

/**
 * @author 
 */
public class StudentListDO implements Serializable {
    private Long id;

    private String username;

    private Long qqNum;

    private String studyType;

    private Long studyTime;

    private String school;

    private String studyId;

    private String dailyLink;

    private String promise;

    private String teachBro;

    private String knowUsFrom;

    private Long createAt;

    private Long updateAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getQqNum() {
        return qqNum;
    }

    public void setQqNum(Long qqNum) {
        this.qqNum = qqNum;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public Long getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Long studyTime) {
        this.studyTime = studyTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getDailyLink() {
        return dailyLink;
    }

    public void setDailyLink(String dailyLink) {
        this.dailyLink = dailyLink;
    }

    public String getPromise() {
        return promise;
    }

    public void setPromise(String promise) {
        this.promise = promise;
    }

    public String getTeachBro() {
        return teachBro;
    }

    public void setTeachBro(String teachBro) {
        this.teachBro = teachBro;
    }

    public String getKnowUsFrom() {
        return knowUsFrom;
    }

    public void setKnowUsFrom(String knowUsFrom) {
        this.knowUsFrom = knowUsFrom;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        StudentListDO other = (StudentListDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getQqNum() == null ? other.getQqNum() == null : this.getQqNum().equals(other.getQqNum()))
            && (this.getStudyType() == null ? other.getStudyType() == null : this.getStudyType().equals(other.getStudyType()))
            && (this.getStudyTime() == null ? other.getStudyTime() == null : this.getStudyTime().equals(other.getStudyTime()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getStudyId() == null ? other.getStudyId() == null : this.getStudyId().equals(other.getStudyId()))
            && (this.getDailyLink() == null ? other.getDailyLink() == null : this.getDailyLink().equals(other.getDailyLink()))
            && (this.getPromise() == null ? other.getPromise() == null : this.getPromise().equals(other.getPromise()))
            && (this.getTeachBro() == null ? other.getTeachBro() == null : this.getTeachBro().equals(other.getTeachBro()))
            && (this.getKnowUsFrom() == null ? other.getKnowUsFrom() == null : this.getKnowUsFrom().equals(other.getKnowUsFrom()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getQqNum() == null) ? 0 : getQqNum().hashCode());
        result = prime * result + ((getStudyType() == null) ? 0 : getStudyType().hashCode());
        result = prime * result + ((getStudyTime() == null) ? 0 : getStudyTime().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getStudyId() == null) ? 0 : getStudyId().hashCode());
        result = prime * result + ((getDailyLink() == null) ? 0 : getDailyLink().hashCode());
        result = prime * result + ((getPromise() == null) ? 0 : getPromise().hashCode());
        result = prime * result + ((getTeachBro() == null) ? 0 : getTeachBro().hashCode());
        result = prime * result + ((getKnowUsFrom() == null) ? 0 : getKnowUsFrom().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", qqNum=").append(qqNum);
        sb.append(", studyType=").append(studyType);
        sb.append(", studyTime=").append(studyTime);
        sb.append(", school=").append(school);
        sb.append(", studyId=").append(studyId);
        sb.append(", dailyLink=").append(dailyLink);
        sb.append(", promise=").append(promise);
        sb.append(", teachBro=").append(teachBro);
        sb.append(", knowUsFrom=").append(knowUsFrom);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}