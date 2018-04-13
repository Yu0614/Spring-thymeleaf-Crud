package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Player;
import com.example.demo.mapper.PlayerMapper;



@Service
public class PlayerService {
	@Autowired // 自動紐付け いちいち new しなくてよくなる
	private PlayerMapper playerMapper;

	// functions
	@Transactional
	public List<Player> findAll() {
		return playerMapper.findAll();
	}
	@Transactional
	public Player findOne(Long id) {
		return playerMapper.findOne(id);
	}
	@Transactional
	public void save(Player player) {
		playerMapper.save(player);
	}
	@Transactional
	public void update(Player player) {
		playerMapper.update(player);
	}
	@Transactional
	public void delete(Long id) {
		playerMapper.delete(id);
	}

}
