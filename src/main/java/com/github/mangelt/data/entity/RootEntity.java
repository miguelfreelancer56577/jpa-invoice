package com.github.mangelt.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@MappedSuperclass
@Data
public class RootEntity {
	@XmlTransient
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
	protected int id;
	@UpdateTimestamp
	@XmlTransient
    protected LocalDateTime lastUpdatedDate;
    @CreationTimestamp
    @XmlTransient
    protected LocalDateTime createdDate;
}
