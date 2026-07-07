export default {
	baseUrl: 'http://localhost:8080/springboot8a059t9y/',
	name: '/springboot8a059t9y',
	indexNav: [
		{
			name: '渔场信息',
			url: '/index/yuchangxinxi',
		},
		{
			name: '通知公告',
			url: '/index/news'
		},
	],
	cateList: [
		{
			name: '通知公告',
			refTable: 'newstype',
			refColumn: 'typename',
		},
	]
}
