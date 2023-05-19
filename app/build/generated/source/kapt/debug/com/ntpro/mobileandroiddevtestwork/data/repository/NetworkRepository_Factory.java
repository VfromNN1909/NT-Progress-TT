// Generated by Dagger (https://dagger.dev).
package com.ntpro.mobileandroiddevtestwork.data.repository;

import com.ntpro.mobileandroiddevtestwork.data.network.Server;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkRepository_Factory implements Factory<NetworkRepository> {
  private final Provider<Server> serverProvider;

  public NetworkRepository_Factory(Provider<Server> serverProvider) {
    this.serverProvider = serverProvider;
  }

  @Override
  public NetworkRepository get() {
    return newInstance(serverProvider.get());
  }

  public static NetworkRepository_Factory create(Provider<Server> serverProvider) {
    return new NetworkRepository_Factory(serverProvider);
  }

  public static NetworkRepository newInstance(Server server) {
    return new NetworkRepository(server);
  }
}
