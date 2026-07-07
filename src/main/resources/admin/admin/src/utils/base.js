const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot8a059t9y/",
            name: "springboot8a059t9y",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot8a059t9y/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Spring Boot的钓手渔场管理系统设计与实现"
        } 
    }
}
export default base
