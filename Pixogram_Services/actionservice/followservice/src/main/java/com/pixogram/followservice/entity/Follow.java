package com.pixogram.followservice.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity 
@Table(name = "follow")
public class Follow implements Serializable{
	@Id
	@Column(insertable = true)
	private Integer userId;
	@Id
	@Column(insertable = true)
	private Integer followerUserId;
}
