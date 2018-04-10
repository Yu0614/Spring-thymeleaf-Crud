package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

/******************
 * テーブルへアクセスするための基本的な処理はJPAがが用意してくれているのでSQLを書かなくてよい
JPAのJpaRepositoryを継承したinterfaceを作成することで利用できる
findAllやsave等用意されている典型的な操作以外のことをしたくなったら、repositoryに追記していくことになる
 */
}
