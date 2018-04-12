package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Player;

@Mapper
public interface PlayerMapper {
    List<Player> findAll();

    Player findOne(Long id);

    void save(Player player);

    void update(Player player);

    void delete(Long id);
}