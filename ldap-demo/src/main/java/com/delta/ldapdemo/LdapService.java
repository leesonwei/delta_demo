package com.delta.ldapdemo;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

/**
 * @author LIZONG.WEI
 * @version V1.0
 * @description
 * @date 2019/9/8 14:03
 */
public class LdapService {

        public LdapService() {
        }

        @SuppressWarnings("unchecked")
        public static void main(String[] args) {

            String root = "CN=SRV-ADDService01,OU=Users,OU=TWTN1,OU=TW,OU=Delta,DC=delta,DC=corp"; //root

            @SuppressWarnings("rawtypes")
            Hashtable env = new Hashtable();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://deltaldap.deltaww.com:3268/" + root);
            env.put(Context.SECURITY_AUTHENTICATION, "simple");
            //env.put(Context.SECURITY_PRINCIPAL, "CN=SRV-ADDService01,OU=Users,OU=TWTN1,OU=TW,OU=Delta,DC=delta,DC=corp");
            //env.put(Context.SECURITY_CREDENTIALS, "ZAQ!2wsx");
            env.put(Context.SECURITY_PRINCIPAL, "SRV-TestAdmin.ADD");
            env.put(Context.SECURITY_CREDENTIALS, "2wsx!QAZ");
            DirContext ctx = null;
            try {
                ctx = new InitialDirContext(env);
                System.out.println("认证成功");
            }
            catch (javax.naming.AuthenticationException e) {
                e.printStackTrace();
                System.out.println("认证失败");
            }
            catch (Exception e) {
                System.out.println("认证出错：");
                e.printStackTrace();
            }

            if (ctx != null) {
                try {
                    ctx.close();
                }
                catch (NamingException e) {
                    //ignore
                }
            }
            System.exit(0);
        }

}
