package com.office.service;

import com.office.pojo.Gl;
import com.office.dao.GlMapper;
import org.springframework.stereotype.Service;

public interface GlService {
    Gl findGlByglname(String  glname);
}