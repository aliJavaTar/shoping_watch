package com.microsoft.whtch.util;

import org.modelmapper.ModelMapper;

public class Mapper {
    private static ModelMapper mapper;

    private Mapper() {
    }

    public static ModelMapper getMapper() {
        return mapper != null ? mapper : new ModelMapper();
    }
}
