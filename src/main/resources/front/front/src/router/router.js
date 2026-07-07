import VueRouter from 'vue-router'
//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import yuchangzhuList from '../pages/yuchangzhu/list'
import yuchangzhuDetail from '../pages/yuchangzhu/detail'
import yuchangzhuAdd from '../pages/yuchangzhu/add'
import huiyuandengjiList from '../pages/huiyuandengji/list'
import huiyuandengjiDetail from '../pages/huiyuandengji/detail'
import huiyuandengjiAdd from '../pages/huiyuandengji/add'
import chongzhijiluList from '../pages/chongzhijilu/list'
import chongzhijiluDetail from '../pages/chongzhijilu/detail'
import chongzhijiluAdd from '../pages/chongzhijilu/add'
import yuzhongleixingList from '../pages/yuzhongleixing/list'
import yuzhongleixingDetail from '../pages/yuzhongleixing/detail'
import yuzhongleixingAdd from '../pages/yuzhongleixing/add'
import yuchangxinxiList from '../pages/yuchangxinxi/list'
import yuchangxinxiDetail from '../pages/yuchangxinxi/detail'
import yuchangxinxiAdd from '../pages/yuchangxinxi/add'
import yuyuechitangList from '../pages/yuyuechitang/list'
import yuyuechitangDetail from '../pages/yuyuechitang/detail'
import yuyuechitangAdd from '../pages/yuyuechitang/add'
import yuyuequxiaoList from '../pages/yuyuequxiao/list'
import yuyuequxiaoDetail from '../pages/yuyuequxiao/detail'
import yuyuequxiaoAdd from '../pages/yuyuequxiao/add'
import huiyujiluList from '../pages/huiyujilu/list'
import huiyujiluDetail from '../pages/huiyujilu/detail'
import huiyujiluAdd from '../pages/huiyujilu/add'
import chatmessageList from '../pages/chatmessage/list'
import chatmessageDetail from '../pages/chatmessage/detail'
import chatmessageAdd from '../pages/chatmessage/add'
import friendList from '../pages/friend/list'
import friendDetail from '../pages/friend/detail'
import friendAdd from '../pages/friend/add'
import syslogList from '../pages/syslog/list'
import syslogDetail from '../pages/syslog/detail'
import syslogAdd from '../pages/syslog/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussyuchangxinxiList from '../pages/discussyuchangxinxi/list'
import discussyuchangxinxiDetail from '../pages/discussyuchangxinxi/detail'
import discussyuchangxinxiAdd from '../pages/discussyuchangxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'yuchangzhu',
					component: yuchangzhuList
				},
				{
					path: 'yuchangzhuDetail',
					component: yuchangzhuDetail
				},
				{
					path: 'yuchangzhuAdd',
					component: yuchangzhuAdd
				},
				{
					path: 'huiyuandengji',
					component: huiyuandengjiList
				},
				{
					path: 'huiyuandengjiDetail',
					component: huiyuandengjiDetail
				},
				{
					path: 'huiyuandengjiAdd',
					component: huiyuandengjiAdd
				},
				{
					path: 'chongzhijilu',
					component: chongzhijiluList
				},
				{
					path: 'chongzhijiluDetail',
					component: chongzhijiluDetail
				},
				{
					path: 'chongzhijiluAdd',
					component: chongzhijiluAdd
				},
				{
					path: 'yuzhongleixing',
					component: yuzhongleixingList
				},
				{
					path: 'yuzhongleixingDetail',
					component: yuzhongleixingDetail
				},
				{
					path: 'yuzhongleixingAdd',
					component: yuzhongleixingAdd
				},
				{
					path: 'yuchangxinxi',
					component: yuchangxinxiList
				},
				{
					path: 'yuchangxinxiDetail',
					component: yuchangxinxiDetail
				},
				{
					path: 'yuchangxinxiAdd',
					component: yuchangxinxiAdd
				},
				{
					path: 'yuyuechitang',
					component: yuyuechitangList
				},
				{
					path: 'yuyuechitangDetail',
					component: yuyuechitangDetail
				},
				{
					path: 'yuyuechitangAdd',
					component: yuyuechitangAdd
				},
				{
					path: 'yuyuequxiao',
					component: yuyuequxiaoList
				},
				{
					path: 'yuyuequxiaoDetail',
					component: yuyuequxiaoDetail
				},
				{
					path: 'yuyuequxiaoAdd',
					component: yuyuequxiaoAdd
				},
				{
					path: 'huiyujilu',
					component: huiyujiluList
				},
				{
					path: 'huiyujiluDetail',
					component: huiyujiluDetail
				},
				{
					path: 'huiyujiluAdd',
					component: huiyujiluAdd
				},
				{
					path: 'chatmessage',
					component: chatmessageList
				},
				{
					path: 'chatmessageDetail',
					component: chatmessageDetail
				},
				{
					path: 'chatmessageAdd',
					component: chatmessageAdd
				},
				{
					path: 'friend',
					component: friendList
				},
				{
					path: 'friendDetail',
					component: friendDetail
				},
				{
					path: 'friendAdd',
					component: friendAdd
				},
				{
					path: 'syslog',
					component: syslogList
				},
				{
					path: 'syslogDetail',
					component: syslogDetail
				},
				{
					path: 'syslogAdd',
					component: syslogAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussyuchangxinxi',
					component: discussyuchangxinxiList
				},
				{
					path: 'discussyuchangxinxiDetail',
					component: discussyuchangxinxiDetail
				},
				{
					path: 'discussyuchangxinxiAdd',
					component: discussyuchangxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
