# Java-DTO-DAO

### Connection to mysql
1. [Follow this link to delete all previous borken mysql versions](https://gist.github.com/operatino/392614486ce4421063b9dece4dfe6c21)
2. Delete all files under /usr/local/var/mysql (rm -r mysql; mkdir mysql)
3. [Initialize mysql server daemon](https://gist.github.com/operatino/392614486ce4421063b9dece4dfe6c21#gistcomment-2703813)
4. [Follow this link to connect to mysql on your local](https://superuser.com/a/603027)
5. Exit mysql CLI : `exit;` 

### Spring bean issues workaround
1. [import org.springframework.web.*cannot be resolved](https://blog.csdn.net/qq_40604853/article/details/84325774)

reference: 
* https://medium.com/@tariqul.islam.rony/spring-boot-with-visual-studio-code-visual-studio-code-part-2-7943febb52f8
* https://coderwall.com/p/os6woq/uninstall-all-those-broken-versions-of-mysql-and-re-install-it-with-brew-on-mac-mavericks
* https://superuser.com/questions/192219/is-there-a-way-to-list-and-kill-running-processes-on-mac-os-x-in-a-windows-ctrl
* https://gist.github.com/operatino/392614486ce4421063b9dece4dfe6c21
* https://superuser.com/questions/603026/mysql-how-to-fix-access-denied-for-user-rootlocalhost
