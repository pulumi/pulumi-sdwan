# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities

import types

__config__ = pulumi.Config('sdwan')


class _ExportableConfig(types.ModuleType):
    @_builtins.property
    def insecure(self) -> Optional[bool]:
        """
        Allow insecure HTTPS client. This can also be set as the `SDWAN_INSECURE` environment variable. Defaults to `true`.
        """
        return __config__.get_bool('insecure')

    @_builtins.property
    def password(self) -> Optional[str]:
        """
        Password for the SD-WAN Manager account. This can also be set as the `SDWAN_PASSWORD` environment variable.
        """
        return __config__.get('password')

    @_builtins.property
    def retries(self) -> Optional[int]:
        """
        Number of retries for REST API calls. This can also be set as the `SDWAN_RETRIES` environment variable. Defaults to `3`.
        """
        return __config__.get_int('retries')

    @_builtins.property
    def url(self) -> Optional[str]:
        """
        URL of the Cisco SD-WAN Manager device. This can also be set as the `SDWAN_URL` environment variable.
        """
        return __config__.get('url')

    @_builtins.property
    def username(self) -> Optional[str]:
        """
        Username for the SD-WAN Manager account. This can also be set as the `SDWAN_USERNAME` environment variable.
        """
        return __config__.get('username')

