package com.chinadci.oneshopreception;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class daimacode {
    public static void main(String[] args) {
        //构建一个代码生成器对象
        AutoGenerator autoGenerator = new AutoGenerator();
        //配置策略
        //1.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir"); //当前项目
        gc.setOutputDir(projectPath + "/oneshop-reception/src/main/java"); // 输出路径
        gc.setFileOverride(true); // 默认 false ,是否覆盖已生成文件
        gc.setOpen(false); //默认true ,是否打开输出目录
        gc.setEnableCache(false); // 默认false,是否开启二级缓存
        gc.setAuthor("zyk"); // 作者
        gc.setSwagger2(true); //默认false
        gc.setBaseResultMap(true); // 默认false
        gc.setDateType(DateType.TIME_PACK); // 时间策略 默认TIME_PACK
        gc.setBaseColumnList(true); //默认false  和basemodel相似
        gc.setEntityName("%s");
        gc.setControllerName("%sController");
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("I%sMapper");
        gc.setXmlName("%sMapper");
        gc.setIdType(IdType.AUTO); // 指定生成的主键类型
        autoGenerator.setGlobalConfig(gc);
        //设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/oneshop");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setDbType(DbType.MYSQL);
        autoGenerator.setDataSource(dsc);

        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(null);
        pc.setParent("com.chinadci.oneshopreception");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        autoGenerator.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setInclude("tb_user", "tb_product","tb_type");
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);//自动生成lombok
        //自动填充配置
        TableFill create = new TableFill("create", FieldFill.INSERT);
        TableFill update = new TableFill("update", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> list = new ArrayList<>();
        list.add(create);
        list.add(update);
        strategy.setTableFillList(list);
        //乐观锁
        strategy.setVersionFieldName("version");
        strategy.setControllerMappingHyphenStyle(true);  //下划线
        autoGenerator.setStrategy(strategy);
        autoGenerator.execute();
    }
}
