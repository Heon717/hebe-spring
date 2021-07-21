package com.hebe.service;

import com.hebe.mapper.MainMapper;
import com.hebe.vo.CardDomain;
import com.hebe.vo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainMapper MainMapper;

    // 전체 글 인기순 정렬
    public List<CardDomain> selPopularList() { return MainMapper.selPopularList(); }

    // 전체 글 최신순 정렬
    public List<CardDomain> selRecentList() {
        return MainMapper.selRecentList();
    }

    // 유저 검색
    public UserEntity searchUser(UserEntity param) {
        return MainMapper.searchUser(param);
    }

}
