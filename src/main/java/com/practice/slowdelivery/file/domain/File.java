package com.practice.slowdelivery.file.domain;

import com.practice.slowdelivery.common.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class File extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Embedded
    public FileName fileName;

    private String filePath;

    @Builder
    public File(FileName fileName, String filePath){
        this.fileName = fileName;
        this.filePath = filePath;
    }
}
