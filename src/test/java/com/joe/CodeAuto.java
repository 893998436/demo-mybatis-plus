package com.joe;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

public class CodeAuto {
    public static void main(String[] args) {
        //构建对象器
        AutoGenerator autoGenerator = new AutoGenerator();
        //配置策略

        //1.全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String pojectPat=System.getProperty("user.dir");
        globalConfig.setOutputDir(pojectPat+"/src/main/java");
        globalConfig.setAuthor("乔");
        globalConfig.setOpen(false);
        globalConfig.setFileOverride(false);
        globalConfig.setServiceName("%sService");
        globalConfig.setIdType(IdType.ASSIGN_ID);
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setSwagger2(true);
        autoGenerator.setGlobalConfig(globalConfig);
        //设置数据源配置

        autoGenerator.execute();
    }
}
