# hellobean-id-and-name-attribute
Beans In Spring Framework

Bean is a Software Reusable Component. It is a normal java class cotains properties and the corresponding setXXX() and getXXX() methods and which are 
created and managed by IOC Container in Spring Framework

Beans Rules & Regulations :

1. Bean classes must be POJO Classes, they must not extends or implements any predefined library except java.io.Serializable marker interface.
2. Bean must be declared as "public", "Non-abstract" and "non-final"
3. In Bean, we have to declare all properties as "private" and all behaviours(methods) as "public" to imporve "Encapsulation"
5. We must have to provide Default Constructor. If we are providing our multi argument contructor.

There are three ways to provide bean configuration in Spring Framework:
1. XML Configuration
2. Java Based Configuration
3. Annotations Configuration

<beans xsd>
<bean id="---" name="----" class="full qualified name of class">
<property name="---" value="---"/>
</bean>
</beans>

<beans> tag is root tag in beans configuration file.
<bean> tag is able to provide configuration details of perticular bean class.
id attribute : It is able to exactly one identity to the bean Object, We can not provide more than one identity.
name attribute : It is use to provide one and more than one identity to bean Object using space, ; & , as seprator.

We can use both in Bean Configuration

We can provide explectly alias name to bean using 
<alias name="helloBean" alias="helloBean2"> tag
