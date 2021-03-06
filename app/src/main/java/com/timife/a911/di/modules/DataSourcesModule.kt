package com.timife.a911.di.modules

import com.timife.a911.data.source.EmergencyDataSource
import com.timife.a911.data.source.local.EmergencyLocalDataSource
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DataSourcesModule {

    @Singleton
    @Binds
    abstract fun provideEmergencyLocalDataSource(
        dataSource: EmergencyLocalDataSource
    ): EmergencyDataSource
}