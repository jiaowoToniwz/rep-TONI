package com.yc.favorite;

import org.junit.Test;

import com.yc.favorite.bean.Favorite;
import com.yc.favorite.biz.BizException;
import com.yc.favorite.biz.FavoriteBiz;

public class favoriteTest {
	@Test
	public void insertTest() throws BizException {
		FavoriteBiz biz = new FavoriteBiz();
		Favorite f = new Favorite();
		f.setfTags("搜索，无聊");
		f.setfDesc("搜索引擎");
		f.setfLabel("百度");
		f.setfUrl("www.baidu.com");
		biz.addFavorite(f);
	}
}
