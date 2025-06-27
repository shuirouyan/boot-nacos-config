package com.example.nacosproperties.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.nacosproperties.entity.Jokes;
import com.example.nacosproperties.service.JokesService;
import com.example.nacosproperties.mapper.JokesMapper;
import org.springframework.stereotype.Service;

/**
* @author kangchen
* @description 针对表【jokes】的数据库操作Service实现
* @createDate 2025-06-27 12:41:38
*/
@Service
public class JokesServiceImpl extends ServiceImpl<JokesMapper, Jokes>
    implements JokesService{

}




