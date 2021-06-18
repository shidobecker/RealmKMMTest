package br.com.shido.realmtest.data

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()