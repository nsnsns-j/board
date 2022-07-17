package com.example.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 投稿のリポジトリー.
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//	public interface 名前 extends JpaRepository <エンティティ , IDタイプ>
//	IDタイプ・・・ここではlong型
//	インターフェイスに、あらかじめ検索メソッドを定義しておくことで、メソッドを呼び出すだけでスマートにデータ検索が行えるようになる（findAll）
//	JpaRepositoryは、インターフェイスを用意するだけで、自動的にクラスを作りBeanを生成する。クラスを作る必要がない！！
	/**
	 * IDで検索する
	 *
	 * @param id ID
	 * @return 投稿
	 */
	public Optional<Post> findById(String id);
//	    java.util.Optionalは「nullかもしれない値」を上手に取り扱うためのクラス
//	    idを受け取って、Post型のインスタンスを返すんだけど、PostがNullかもしれない、という意味

	/**
	 * 更新日時の降順ですべての投稿を検索する
	 *
	 * @return 投稿のリスト
	 */
	
//	List<Post> findAllByOrderByUpdatedDateDesc();
	
	/**
	    * 更新日時の降順で未削除の投稿を検索する
	    *
	    * @return 投稿のリスト
	    */
	
	List<Post> findByDeletedFalseOrderByUpdatedDateDesc();

}