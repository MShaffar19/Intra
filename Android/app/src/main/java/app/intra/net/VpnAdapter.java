/*
Copyright 2018 Jigsaw Operations LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package app.intra.net;

/**
 * Abstract class representing a VPN Adapter, for use by IntraVpnService.  For our purposes, a
 * VpnAdapter is just a thread that can safely be stopped at any time.
 */
public abstract class VpnAdapter {
  // This value must match the hardcoded MTU in outline-go-tun2socks.
  // TODO: Make outline-go-tun2socks's MTU configurable.
  protected static final int VPN_INTERFACE_MTU = 1500;
  protected static final int DNS_DEFAULT_PORT = 53;

  public abstract void start();

  /**
   * Perform a safe shutdown.
   */
  public abstract void close();
}