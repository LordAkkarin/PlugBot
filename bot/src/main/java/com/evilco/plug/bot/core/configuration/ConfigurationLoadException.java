package com.evilco.plug.bot.core.configuration;

/**
 * @auhtor Johannes Donath <johannesd@evil-co.com>
 * @copyright Copyright (C) 2014 Evil-Co <http://www.evil-co.org>
 */
public class ConfigurationLoadException extends ConfigurationException {

	public ConfigurationLoadException () {
		super ();
	}

	public ConfigurationLoadException (String message) {
		super (message);
	}

	public ConfigurationLoadException (String message, Throwable cause) {
		super (message, cause);
	}

	public ConfigurationLoadException (Throwable cause) {
		super (cause);
	}
}
