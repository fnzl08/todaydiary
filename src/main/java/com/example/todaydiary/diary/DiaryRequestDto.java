package com.example.todaydiary.diary;

import lombok.Getter;

import java.util.List;


@Getter
public class DiaryRequestDto {
    private String emotion;
    private String tag;
    private List<ImageUrl> imageUrlList;
    private String title;
    private String content;
    private Boolean is_open;
}
