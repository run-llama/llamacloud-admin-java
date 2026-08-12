// File generated from our OpenAPI spec by Stainless.

package ai.llamaindex.llamacloudadmin.proguard

import ai.llamaindex.llamacloudadmin.client.okhttp.LlamaCloudAdminOkHttpClient
import ai.llamaindex.llamacloudadmin.core.JsonValue
import ai.llamaindex.llamacloudadmin.core.jsonMapper
import ai.llamaindex.llamacloudadmin.models.organizations.Organization
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/llama-cloud-admin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = LlamaCloudAdminOkHttpClient.builder()
            .apiKey("My API Key")
            .build()

        assertThat(client).isNotNull()
        assertThat(client.organizations()).isNotNull()
        assertThat(client.projects()).isNotNull()
        assertThat(client.invites()).isNotNull()
        assertThat(client.admin()).isNotNull()
    }

    @Test
    fun organizationRoundtrip() {
      val jsonMapper = jsonMapper()
      val organization = Organization.builder()
          .id("id")
          .name("name")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .metadata(Organization.Metadata.builder()
              .putAdditionalProperty("foo", JsonValue.from("bar"))
              .build())
          .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val roundtrippedOrganization = jsonMapper.readValue(jsonMapper.writeValueAsString(organization), jacksonTypeRef<Organization>())

      assertThat(roundtrippedOrganization).isEqualTo(organization)
    }
}
