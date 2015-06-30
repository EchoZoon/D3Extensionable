# D3Extensionable
自己研究的可点击力导图节点进行扩展，可zoom,可drag的样例

#Usage:

*1, 使用MyEclipse8.5创建一个Web Service Project,命名为 D3Extensionable; 

##2, 创建一个新的package, dataStructsUtils,依次创建包中的类;

##3, 创建新的package, getQQ_QunInfo,创建包中的类;

##4, 在WebRoot目录下新建Static目录, 按照项目中的目录层次放置jqeury和d3的源库文件;

##5, 把qqD3.jsp拷贝至WebRoot目录下;

##6, 创建servlet, 所属包建为goDrawQQD3, url指定为goDrawQQD3.do;

##7, 创建servlet, 所属包为goDrawQQD3, url指定为callBackDrawQQD3.do;

##8, 创建servlet, 所属包为goDrawQQD3, url指定为getMoreChildren.do;

##9, 把项目中的goDrawQQD3包中的三个文件覆盖至自己的项目;

##10, 打开浏览器，访问这个项目地址：http://localhost:8080/D3Extensionable/goDrawQQD3.do,即可看到效果

