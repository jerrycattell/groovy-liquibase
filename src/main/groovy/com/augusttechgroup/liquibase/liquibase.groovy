package com.augusttechgroup.liquibase

import liquibase.parser.ext.GroovyLiquibaseChangeLogParser
import liquibase.parser.*
import liquibase.resource.FileSystemResourceAccessor


ChangeLogParserFactory.getInstance().register(new GroovyLiquibaseChangeLogParser())

//changeLogFile = 'src/test/changelog/basic-changelog.groovy'
//resourceAccessor = new FileSystemResourceAccessor(baseDirectory: '.')
//parser = ChangeLogParserFactory.getInstance().getParser(changeLogFile, resourceAccessor)
//
//def changeLog = parser.parse(changeLogFile, null, resourceAccessor)
//
//println changeLog.changeSets
