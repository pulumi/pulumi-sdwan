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
from . import _utilities

__all__ = ['TlsSslProfilePolicyDefinitionArgs', 'TlsSslProfilePolicyDefinition']

@pulumi.input_type
class TlsSslProfilePolicyDefinitionArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[_builtins.str],
                 allow_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 allow_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 block_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 block_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 decrypt_threshold: Optional[pulumi.Input[_builtins.str]] = None,
                 fail_decrypt: Optional[pulumi.Input[_builtins.bool]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 never_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 reputation: Optional[pulumi.Input[_builtins.bool]] = None,
                 skip_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        The set of arguments for constructing a TlsSslProfilePolicyDefinition resource.
        :param pulumi.Input[_builtins.str] description: The description of the policy definition.
        :param pulumi.Input[_builtins.str] allow_url_list_id: Allow URL list ID
        :param pulumi.Input[_builtins.int] allow_url_list_version: Allow URL list version
        :param pulumi.Input[_builtins.str] block_url_list_id: Block URL list ID
        :param pulumi.Input[_builtins.int] block_url_list_version: Block URL list version
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] decrypt_categories: Categories that should be decrypted
        :param pulumi.Input[_builtins.str] decrypt_threshold: Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        :param pulumi.Input[_builtins.bool] fail_decrypt: Fail decrypt enabled
        :param pulumi.Input[_builtins.str] mode: The policy mode - Choices: `security`, `unified`
        :param pulumi.Input[_builtins.str] name: The name of the policy definition.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] never_decrypt_categories: Categories that should never be decrypted
        :param pulumi.Input[_builtins.bool] reputation: Reputation enabled
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] skip_decrypt_categories: Categories that should skipped
        """
        pulumi.set(__self__, "description", description)
        if allow_url_list_id is not None:
            pulumi.set(__self__, "allow_url_list_id", allow_url_list_id)
        if allow_url_list_version is not None:
            pulumi.set(__self__, "allow_url_list_version", allow_url_list_version)
        if block_url_list_id is not None:
            pulumi.set(__self__, "block_url_list_id", block_url_list_id)
        if block_url_list_version is not None:
            pulumi.set(__self__, "block_url_list_version", block_url_list_version)
        if decrypt_categories is not None:
            pulumi.set(__self__, "decrypt_categories", decrypt_categories)
        if decrypt_threshold is not None:
            pulumi.set(__self__, "decrypt_threshold", decrypt_threshold)
        if fail_decrypt is not None:
            pulumi.set(__self__, "fail_decrypt", fail_decrypt)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if never_decrypt_categories is not None:
            pulumi.set(__self__, "never_decrypt_categories", never_decrypt_categories)
        if reputation is not None:
            pulumi.set(__self__, "reputation", reputation)
        if skip_decrypt_categories is not None:
            pulumi.set(__self__, "skip_decrypt_categories", skip_decrypt_categories)

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Input[_builtins.str]:
        """
        The description of the policy definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="allowUrlListId")
    def allow_url_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Allow URL list ID
        """
        return pulumi.get(self, "allow_url_list_id")

    @allow_url_list_id.setter
    def allow_url_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allow_url_list_id", value)

    @_builtins.property
    @pulumi.getter(name="allowUrlListVersion")
    def allow_url_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Allow URL list version
        """
        return pulumi.get(self, "allow_url_list_version")

    @allow_url_list_version.setter
    def allow_url_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "allow_url_list_version", value)

    @_builtins.property
    @pulumi.getter(name="blockUrlListId")
    def block_url_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Block URL list ID
        """
        return pulumi.get(self, "block_url_list_id")

    @block_url_list_id.setter
    def block_url_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "block_url_list_id", value)

    @_builtins.property
    @pulumi.getter(name="blockUrlListVersion")
    def block_url_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Block URL list version
        """
        return pulumi.get(self, "block_url_list_version")

    @block_url_list_version.setter
    def block_url_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "block_url_list_version", value)

    @_builtins.property
    @pulumi.getter(name="decryptCategories")
    def decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should be decrypted
        """
        return pulumi.get(self, "decrypt_categories")

    @decrypt_categories.setter
    def decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "decrypt_categories", value)

    @_builtins.property
    @pulumi.getter(name="decryptThreshold")
    def decrypt_threshold(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        """
        return pulumi.get(self, "decrypt_threshold")

    @decrypt_threshold.setter
    def decrypt_threshold(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "decrypt_threshold", value)

    @_builtins.property
    @pulumi.getter(name="failDecrypt")
    def fail_decrypt(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Fail decrypt enabled
        """
        return pulumi.get(self, "fail_decrypt")

    @fail_decrypt.setter
    def fail_decrypt(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "fail_decrypt", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy mode - Choices: `security`, `unified`
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="neverDecryptCategories")
    def never_decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should never be decrypted
        """
        return pulumi.get(self, "never_decrypt_categories")

    @never_decrypt_categories.setter
    def never_decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "never_decrypt_categories", value)

    @_builtins.property
    @pulumi.getter
    def reputation(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Reputation enabled
        """
        return pulumi.get(self, "reputation")

    @reputation.setter
    def reputation(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "reputation", value)

    @_builtins.property
    @pulumi.getter(name="skipDecryptCategories")
    def skip_decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should skipped
        """
        return pulumi.get(self, "skip_decrypt_categories")

    @skip_decrypt_categories.setter
    def skip_decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "skip_decrypt_categories", value)


@pulumi.input_type
class _TlsSslProfilePolicyDefinitionState:
    def __init__(__self__, *,
                 allow_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 allow_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 block_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 block_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 decrypt_threshold: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 fail_decrypt: Optional[pulumi.Input[_builtins.bool]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 never_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 reputation: Optional[pulumi.Input[_builtins.bool]] = None,
                 skip_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 version: Optional[pulumi.Input[_builtins.int]] = None):
        """
        Input properties used for looking up and filtering TlsSslProfilePolicyDefinition resources.
        :param pulumi.Input[_builtins.str] allow_url_list_id: Allow URL list ID
        :param pulumi.Input[_builtins.int] allow_url_list_version: Allow URL list version
        :param pulumi.Input[_builtins.str] block_url_list_id: Block URL list ID
        :param pulumi.Input[_builtins.int] block_url_list_version: Block URL list version
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] decrypt_categories: Categories that should be decrypted
        :param pulumi.Input[_builtins.str] decrypt_threshold: Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        :param pulumi.Input[_builtins.str] description: The description of the policy definition.
        :param pulumi.Input[_builtins.bool] fail_decrypt: Fail decrypt enabled
        :param pulumi.Input[_builtins.str] mode: The policy mode - Choices: `security`, `unified`
        :param pulumi.Input[_builtins.str] name: The name of the policy definition.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] never_decrypt_categories: Categories that should never be decrypted
        :param pulumi.Input[_builtins.bool] reputation: Reputation enabled
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] skip_decrypt_categories: Categories that should skipped
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        if allow_url_list_id is not None:
            pulumi.set(__self__, "allow_url_list_id", allow_url_list_id)
        if allow_url_list_version is not None:
            pulumi.set(__self__, "allow_url_list_version", allow_url_list_version)
        if block_url_list_id is not None:
            pulumi.set(__self__, "block_url_list_id", block_url_list_id)
        if block_url_list_version is not None:
            pulumi.set(__self__, "block_url_list_version", block_url_list_version)
        if decrypt_categories is not None:
            pulumi.set(__self__, "decrypt_categories", decrypt_categories)
        if decrypt_threshold is not None:
            pulumi.set(__self__, "decrypt_threshold", decrypt_threshold)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if fail_decrypt is not None:
            pulumi.set(__self__, "fail_decrypt", fail_decrypt)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if never_decrypt_categories is not None:
            pulumi.set(__self__, "never_decrypt_categories", never_decrypt_categories)
        if reputation is not None:
            pulumi.set(__self__, "reputation", reputation)
        if skip_decrypt_categories is not None:
            pulumi.set(__self__, "skip_decrypt_categories", skip_decrypt_categories)
        if version is not None:
            pulumi.set(__self__, "version", version)

    @_builtins.property
    @pulumi.getter(name="allowUrlListId")
    def allow_url_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Allow URL list ID
        """
        return pulumi.get(self, "allow_url_list_id")

    @allow_url_list_id.setter
    def allow_url_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allow_url_list_id", value)

    @_builtins.property
    @pulumi.getter(name="allowUrlListVersion")
    def allow_url_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Allow URL list version
        """
        return pulumi.get(self, "allow_url_list_version")

    @allow_url_list_version.setter
    def allow_url_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "allow_url_list_version", value)

    @_builtins.property
    @pulumi.getter(name="blockUrlListId")
    def block_url_list_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Block URL list ID
        """
        return pulumi.get(self, "block_url_list_id")

    @block_url_list_id.setter
    def block_url_list_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "block_url_list_id", value)

    @_builtins.property
    @pulumi.getter(name="blockUrlListVersion")
    def block_url_list_version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Block URL list version
        """
        return pulumi.get(self, "block_url_list_version")

    @block_url_list_version.setter
    def block_url_list_version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "block_url_list_version", value)

    @_builtins.property
    @pulumi.getter(name="decryptCategories")
    def decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should be decrypted
        """
        return pulumi.get(self, "decrypt_categories")

    @decrypt_categories.setter
    def decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "decrypt_categories", value)

    @_builtins.property
    @pulumi.getter(name="decryptThreshold")
    def decrypt_threshold(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        """
        return pulumi.get(self, "decrypt_threshold")

    @decrypt_threshold.setter
    def decrypt_threshold(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "decrypt_threshold", value)

    @_builtins.property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The description of the policy definition.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "description", value)

    @_builtins.property
    @pulumi.getter(name="failDecrypt")
    def fail_decrypt(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Fail decrypt enabled
        """
        return pulumi.get(self, "fail_decrypt")

    @fail_decrypt.setter
    def fail_decrypt(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "fail_decrypt", value)

    @_builtins.property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The policy mode - Choices: `security`, `unified`
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "mode", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The name of the policy definition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="neverDecryptCategories")
    def never_decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should never be decrypted
        """
        return pulumi.get(self, "never_decrypt_categories")

    @never_decrypt_categories.setter
    def never_decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "never_decrypt_categories", value)

    @_builtins.property
    @pulumi.getter
    def reputation(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Reputation enabled
        """
        return pulumi.get(self, "reputation")

    @reputation.setter
    def reputation(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "reputation", value)

    @_builtins.property
    @pulumi.getter(name="skipDecryptCategories")
    def skip_decrypt_categories(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Categories that should skipped
        """
        return pulumi.get(self, "skip_decrypt_categories")

    @skip_decrypt_categories.setter
    def skip_decrypt_categories(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "skip_decrypt_categories", value)

    @_builtins.property
    @pulumi.getter
    def version(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

    @version.setter
    def version(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "version", value)


@pulumi.type_token("sdwan:index/tlsSslProfilePolicyDefinition:TlsSslProfilePolicyDefinition")
class TlsSslProfilePolicyDefinition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 allow_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 block_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 block_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 decrypt_threshold: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 fail_decrypt: Optional[pulumi.Input[_builtins.bool]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 never_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 reputation: Optional[pulumi.Input[_builtins.bool]] = None,
                 skip_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        This resource can manage a TLS SSL Profile Policy Definition .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TlsSslProfilePolicyDefinition("example",
            name="Example",
            description="My description",
            mode="security",
            decrypt_categories=["alcohol-and-tobacco"],
            never_decrypt_categories=["auctions"],
            skip_decrypt_categories=["cdns"],
            decrypt_threshold="high-risk",
            reputation=False,
            fail_decrypt=True)
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/tlsSslProfilePolicyDefinition:TlsSslProfilePolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] allow_url_list_id: Allow URL list ID
        :param pulumi.Input[_builtins.int] allow_url_list_version: Allow URL list version
        :param pulumi.Input[_builtins.str] block_url_list_id: Block URL list ID
        :param pulumi.Input[_builtins.int] block_url_list_version: Block URL list version
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] decrypt_categories: Categories that should be decrypted
        :param pulumi.Input[_builtins.str] decrypt_threshold: Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        :param pulumi.Input[_builtins.str] description: The description of the policy definition.
        :param pulumi.Input[_builtins.bool] fail_decrypt: Fail decrypt enabled
        :param pulumi.Input[_builtins.str] mode: The policy mode - Choices: `security`, `unified`
        :param pulumi.Input[_builtins.str] name: The name of the policy definition.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] never_decrypt_categories: Categories that should never be decrypted
        :param pulumi.Input[_builtins.bool] reputation: Reputation enabled
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] skip_decrypt_categories: Categories that should skipped
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TlsSslProfilePolicyDefinitionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource can manage a TLS SSL Profile Policy Definition .

        ## Example Usage

        ```python
        import pulumi
        import pulumi_sdwan as sdwan

        example = sdwan.TlsSslProfilePolicyDefinition("example",
            name="Example",
            description="My description",
            mode="security",
            decrypt_categories=["alcohol-and-tobacco"],
            never_decrypt_categories=["auctions"],
            skip_decrypt_categories=["cdns"],
            decrypt_threshold="high-risk",
            reputation=False,
            fail_decrypt=True)
        ```

        ## Import

        The `pulumi import` command can be used, for example:

        ```sh
        $ pulumi import sdwan:index/tlsSslProfilePolicyDefinition:TlsSslProfilePolicyDefinition example "f6b2c44c-693c-4763-b010-895aa3d236bd"
        ```

        :param str resource_name: The name of the resource.
        :param TlsSslProfilePolicyDefinitionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TlsSslProfilePolicyDefinitionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 allow_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 block_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
                 block_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
                 decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 decrypt_threshold: Optional[pulumi.Input[_builtins.str]] = None,
                 description: Optional[pulumi.Input[_builtins.str]] = None,
                 fail_decrypt: Optional[pulumi.Input[_builtins.bool]] = None,
                 mode: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 never_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 reputation: Optional[pulumi.Input[_builtins.bool]] = None,
                 skip_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TlsSslProfilePolicyDefinitionArgs.__new__(TlsSslProfilePolicyDefinitionArgs)

            __props__.__dict__["allow_url_list_id"] = allow_url_list_id
            __props__.__dict__["allow_url_list_version"] = allow_url_list_version
            __props__.__dict__["block_url_list_id"] = block_url_list_id
            __props__.__dict__["block_url_list_version"] = block_url_list_version
            __props__.__dict__["decrypt_categories"] = decrypt_categories
            __props__.__dict__["decrypt_threshold"] = decrypt_threshold
            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            __props__.__dict__["fail_decrypt"] = fail_decrypt
            __props__.__dict__["mode"] = mode
            __props__.__dict__["name"] = name
            __props__.__dict__["never_decrypt_categories"] = never_decrypt_categories
            __props__.__dict__["reputation"] = reputation
            __props__.__dict__["skip_decrypt_categories"] = skip_decrypt_categories
            __props__.__dict__["version"] = None
        super(TlsSslProfilePolicyDefinition, __self__).__init__(
            'sdwan:index/tlsSslProfilePolicyDefinition:TlsSslProfilePolicyDefinition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
            allow_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
            block_url_list_id: Optional[pulumi.Input[_builtins.str]] = None,
            block_url_list_version: Optional[pulumi.Input[_builtins.int]] = None,
            decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            decrypt_threshold: Optional[pulumi.Input[_builtins.str]] = None,
            description: Optional[pulumi.Input[_builtins.str]] = None,
            fail_decrypt: Optional[pulumi.Input[_builtins.bool]] = None,
            mode: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            never_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            reputation: Optional[pulumi.Input[_builtins.bool]] = None,
            skip_decrypt_categories: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            version: Optional[pulumi.Input[_builtins.int]] = None) -> 'TlsSslProfilePolicyDefinition':
        """
        Get an existing TlsSslProfilePolicyDefinition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] allow_url_list_id: Allow URL list ID
        :param pulumi.Input[_builtins.int] allow_url_list_version: Allow URL list version
        :param pulumi.Input[_builtins.str] block_url_list_id: Block URL list ID
        :param pulumi.Input[_builtins.int] block_url_list_version: Block URL list version
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] decrypt_categories: Categories that should be decrypted
        :param pulumi.Input[_builtins.str] decrypt_threshold: Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        :param pulumi.Input[_builtins.str] description: The description of the policy definition.
        :param pulumi.Input[_builtins.bool] fail_decrypt: Fail decrypt enabled
        :param pulumi.Input[_builtins.str] mode: The policy mode - Choices: `security`, `unified`
        :param pulumi.Input[_builtins.str] name: The name of the policy definition.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] never_decrypt_categories: Categories that should never be decrypted
        :param pulumi.Input[_builtins.bool] reputation: Reputation enabled
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] skip_decrypt_categories: Categories that should skipped
        :param pulumi.Input[_builtins.int] version: The version of the object
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TlsSslProfilePolicyDefinitionState.__new__(_TlsSslProfilePolicyDefinitionState)

        __props__.__dict__["allow_url_list_id"] = allow_url_list_id
        __props__.__dict__["allow_url_list_version"] = allow_url_list_version
        __props__.__dict__["block_url_list_id"] = block_url_list_id
        __props__.__dict__["block_url_list_version"] = block_url_list_version
        __props__.__dict__["decrypt_categories"] = decrypt_categories
        __props__.__dict__["decrypt_threshold"] = decrypt_threshold
        __props__.__dict__["description"] = description
        __props__.__dict__["fail_decrypt"] = fail_decrypt
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["never_decrypt_categories"] = never_decrypt_categories
        __props__.__dict__["reputation"] = reputation
        __props__.__dict__["skip_decrypt_categories"] = skip_decrypt_categories
        __props__.__dict__["version"] = version
        return TlsSslProfilePolicyDefinition(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="allowUrlListId")
    def allow_url_list_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Allow URL list ID
        """
        return pulumi.get(self, "allow_url_list_id")

    @_builtins.property
    @pulumi.getter(name="allowUrlListVersion")
    def allow_url_list_version(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Allow URL list version
        """
        return pulumi.get(self, "allow_url_list_version")

    @_builtins.property
    @pulumi.getter(name="blockUrlListId")
    def block_url_list_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Block URL list ID
        """
        return pulumi.get(self, "block_url_list_id")

    @_builtins.property
    @pulumi.getter(name="blockUrlListVersion")
    def block_url_list_version(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        Block URL list version
        """
        return pulumi.get(self, "block_url_list_version")

    @_builtins.property
    @pulumi.getter(name="decryptCategories")
    def decrypt_categories(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Categories that should be decrypted
        """
        return pulumi.get(self, "decrypt_categories")

    @_builtins.property
    @pulumi.getter(name="decryptThreshold")
    def decrypt_threshold(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Decrypt threshold - Choices: `high-risk`, `suspicious`, `moderate-risk`, `low-risk`, `trustworthy`
        """
        return pulumi.get(self, "decrypt_threshold")

    @_builtins.property
    @pulumi.getter
    def description(self) -> pulumi.Output[_builtins.str]:
        """
        The description of the policy definition.
        """
        return pulumi.get(self, "description")

    @_builtins.property
    @pulumi.getter(name="failDecrypt")
    def fail_decrypt(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Fail decrypt enabled
        """
        return pulumi.get(self, "fail_decrypt")

    @_builtins.property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The policy mode - Choices: `security`, `unified`
        """
        return pulumi.get(self, "mode")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        The name of the policy definition.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="neverDecryptCategories")
    def never_decrypt_categories(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Categories that should never be decrypted
        """
        return pulumi.get(self, "never_decrypt_categories")

    @_builtins.property
    @pulumi.getter
    def reputation(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Reputation enabled
        """
        return pulumi.get(self, "reputation")

    @_builtins.property
    @pulumi.getter(name="skipDecryptCategories")
    def skip_decrypt_categories(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Categories that should skipped
        """
        return pulumi.get(self, "skip_decrypt_categories")

    @_builtins.property
    @pulumi.getter
    def version(self) -> pulumi.Output[_builtins.int]:
        """
        The version of the object
        """
        return pulumi.get(self, "version")

